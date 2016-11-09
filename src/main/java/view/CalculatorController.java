package view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/calculator")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("/index");
		System.out.println("Calculator");
		return modelAndView;
	}
	
	@RequestMapping("calculator/form")
	public ModelAndView calcResult(Model model, @RequestParam("action") double vlAction,
	        @RequestParam("interest") double vlInterest, @RequestParam("purch") Integer qtPurch) {
		calculatorFunctions.calcActions(vlAction, vlInterest, qtPurch);
	    return new ModelAndView("redirect:/calculator");
	}
	
	@RequestMapping()
	public ModelAndView getResult() {
		return null;
	}
}
