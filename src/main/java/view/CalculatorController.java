package view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.CalcValidator;

@Controller
public class CalculatorController {
	
	@InitBinder
    public void InitBinder(WebDataBinder binder) {
        binder.addValidators(new CalcValidator());
    }	
	
	@RequestMapping("calculator")
	public ModelAndView index() {
		return null;
	}
	
	@RequestMapping("calculator/form")
	public ModelAndView calcResult() {
		return null;
	}
	
	@RequestMapping()
	public ModelAndView getResult() {
		return null;
	}
}
