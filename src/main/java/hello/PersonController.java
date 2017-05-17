package hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import hello.model.Person;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by elvir_000 on 17.05.2017.
 */
@Controller
@RequestMapping("/demo")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;


    @RequestMapping("/list")
    public String person (Model model) {
        model.addAttribute("person", personRepository.findAll());
        return "person";
    }

    @RequestMapping("/add")
    public @ResponseBody
    String addNewUser(@RequestParam  String name, @RequestParam String surname, @RequestParam String patronymic, @RequestParam String gender, @RequestParam float date_of_birth) {
        Person n = new Person();
        n.setName(name);
        n.setSurname(surname);
        n.setPatronymic(patronymic);
        n.setGender(gender);
        n.setDate_of_birth(date_of_birth);

        personRepository.save(n);
        return "Saved";
    }
    @RequestMapping("/all")
    public @ResponseBody Iterable<Person> getAllPerson(){
        return personRepository.findAll();
    }
    @RequestMapping(value="/person", method= RequestMethod.GET)
    public String personForm(Model model) {
        model.addAttribute("person", new Person());
        return "person";
    }

    @RequestMapping(value="/person", method=RequestMethod.POST)
    public String personSubmit(@ModelAttribute Person n, Model model) {
        personRepository.save(n);
        model.addAttribute("person", n);
        return "result";
    }


}