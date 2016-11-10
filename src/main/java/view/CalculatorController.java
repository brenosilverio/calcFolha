package view;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@RequestMapping(value="/calculator", method=RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("/index");
		System.out.println("Calculator");
		return modelAndView;
	}
	
	@RequestMapping(value="calculator/form", method=RequestMethod.POST)
	public ModelAndView calcResult(Model model, 
			@RequestParam("action") @Valid double vlAction,
			@RequestParam("interest") @Valid double vlInterest, 
			@RequestParam("purch") @Valid Integer qtPurch, BindingResult result,
			RedirectAttributes redirectAttributes) {
		
		if (result.hasErrors()) {
            //return form();
            return index();
        }
		
		calculatorFunctions.calcActions(vlAction, vlInterest, qtPurch);
	    return new ModelAndView("redirect:/calculator");
	}
	
	@RequestMapping()
	public ModelAndView getResult() {
		return null;
	}
}
