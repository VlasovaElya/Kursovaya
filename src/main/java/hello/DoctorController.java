package hello;

import hello.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import hello.model.Doctor;
import hello.DoctorRepository;

/**
 * Created by Анютка on 13.05.2017.
 */
@Controller
@RequestMapping("/demo")
public class DoctorController {
    @Autowired
    private DoctorRepository doctorRepository;

    @RequestMapping("/list")
    public String doctor (Model model) {
        model.addAttribute("doctor", doctorRepository.findAll());
        return "doctor";
    }

    @RequestMapping("/add")
    public
    @ResponseBody
    String add(@RequestParam  String scientific_degree, @RequestParam String academic_title, @RequestParam int n_person, @RequestParam String specialty_branch) {
        Doctor n = new Doctor();
        n.setScientific_degree(scientific_degree);
        n.setAcademic_title(academic_title);
        n.setN_person(n_person);
        n.setSpecialty_branch(specialty_branch);

        doctorRepository.save(n);
        return "Saved";
    }
    @RequestMapping("/all")
    public @ResponseBody Iterable<Doctor> getAllDoctor() {

        return doctorRepository.findAll();
    }
    @RequestMapping(value="/doctor", method= RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("doctor", new Doctor());
        return "doctor";
    }

    @RequestMapping(value="/doctor", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Doctor n, Model model) {
        doctorRepository.save(n);
        model.addAttribute("doctor", n);
        return "result";
    }

}
