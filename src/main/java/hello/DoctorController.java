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
@RequestMapping("/demo1")
public class DoctorController {
    @Autowired
    private DoctorRepository doctorRepository;

    @RequestMapping("/list1")
    public String doctor (Model model) {
        model.addAttribute("doctor", doctorRepository.findAll());
        return "doctor";
    }

    @RequestMapping("/add1")
    public
    @ResponseBody
    String add(
            @RequestParam (value = "scientific_degree", required = true)  String scientific_degree,
               @RequestParam (value = "academic_title", required = true) String academic_title,
               @RequestParam (value = "specialty_branch", required = true) String specialty_branch) {
        Doctor n = new Doctor();
        n.setScientific_degree(scientific_degree);
        n.setAcademic_title(academic_title);
        n.setSpecialty_branch(specialty_branch);

        doctorRepository.save(n);
        return "Saved";
    }
    @RequestMapping("/all1")
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
        return "result2";
    }

}
