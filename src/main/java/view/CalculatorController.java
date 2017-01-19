package view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Calculator;
import service.CalcValidator;
import service.CalculatorFunctions;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorFunctions calculatorFunctions;

    @RequestMapping(value = { "/calculatorForm" }, method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("/home");
        return mv;
    }

    @RequestMapping(value = "/calculator", method = RequestMethod.POST)
    public ModelAndView calcResult(@ModelAttribute("calculator") Calculator calculator) {
        
        calculator = calculatorFunctions.calcActions(calculator);
        ModelAndView mv = new ModelAndView("/home");        
        mv.addObject("results", calculator);
        return mv;
    }
}
