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

    @InitBinder
    public void InitBinder(WebDataBinder binder) {
        binder.addValidators(new CalcValidator());
    }

    @RequestMapping(value = { "/calculatorForm" }, method = RequestMethod.GET)
    public ModelAndView index(Calculator calculator) {
        ModelAndView mv = new ModelAndView("/index");
        return mv;
    }

    @RequestMapping(value = "/calculator", method = RequestMethod.POST)
    public ModelAndView calcResult(@ModelAttribute("calculator") Calculator calculator) {
        
        calculator = calculatorFunctions.calcActions(calculator);
        ModelAndView mv = new ModelAndView("/index");        
        mv.addObject("results", calculator);
        return mv;

    }
}
