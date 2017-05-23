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
import hello.model.Sick;
import hello.SickRepository;

import java.util.Date;

/**
 * Created by elvir_000 on 19.05.2017.
 */
@Controller
@RequestMapping("/demo2")
public class SickController {
    @Autowired
    private SickRepository sickRepository;

    @RequestMapping("/list2")
    public String sick (Model model) {
        model.addAttribute("sick", sickRepository.findAll());
        return "sick";
}
    @RequestMapping("/add2")
    public
    @ResponseBody
    String add(@RequestParam (value = "severity_of_the_condition", required = true) String severity_of_the_condition,
               @RequestParam (value = "date_available", required = true) Date date_available,
               @RequestParam (value = "statement_date", required = true)Date statement_date,
               @RequestParam (value = "diagnosis", required = true) String diagnosis) {
        Sick n = new Sick();

        n.setSeverity_of_the_condition(severity_of_the_condition);
        n.setDate_available(date_available);
        n.setStatement_date(statement_date);
        n.setDiagnosis(diagnosis);


        sickRepository.save(n);
        return "Saved";
    }

    @RequestMapping("/all2")
    public @ResponseBody Iterable<Sick> getAllSick() {

        return sickRepository.findAll();
    }
    @RequestMapping(value="/sick", method= RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("sick", new Sick());
        return "sick";
    }

    @RequestMapping(value="/sick", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Sick n, Model model) {
        sickRepository.save(n);
        model.addAttribute("sick", n);
        return "result3";
    }

}