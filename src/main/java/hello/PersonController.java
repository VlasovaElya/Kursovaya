package hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import hello.model.Person;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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
    String addNewUser(@RequestParam (value = "name", required = true)  String name,
                      @RequestParam (value = "surname", required = true) String surname,
                      @RequestParam (value = "patronymic", required = true) String patronymic,
                      @RequestParam (value = "gender", required = true) String gender,
                      @RequestParam  (value = "date_of_birth", required = true)Date date_of_birth,
                      Model model) {
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
        Person p = new Person();
        model.addAttribute("person", p);
        return "person";
    }


    @RequestMapping(value="/person", method=RequestMethod.POST)
    public String personSubmit(@ModelAttribute Person n, Model model) {
        personRepository.save(n);
        model.addAttribute("person", n);
        return "result";
    }


}