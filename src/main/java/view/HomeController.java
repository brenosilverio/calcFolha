package view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.Users;
import service.CalculatorForm;

@Controller
public class HomeController {
    
    @Autowired
    private CalculatorForm calculatorForm;
	
	@RequestMapping(value = {"/login", "/"})
	public ModelAndView index(){
		System.out.println("HomeController");
		return new ModelAndView("/index");
	}
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.POST)
	public ModelAndView loginForm(@RequestParam ("user") String user, @RequestParam ("pass") String pass) {
	    ModelAndView mv = new ModelAndView();
	    return mv;
	}
	
	
	@RequestMapping(value = "/formRegistration", method = RequestMethod.GET)
    public ModelAndView formRegistration() {
        ModelAndView mv = new ModelAndView("/registration");
        return mv;
    }
	
	@RequestMapping(value = "/loginformRegistration", method = RequestMethod.POST)
    public ModelAndView loginFormRegistration(@RequestParam ("name") String name,
            @RequestParam ("mail") String mail,
            @RequestParam ("pass") String pass) {
	    calculatorForm.saveUser(name, mail, pass);
        ModelAndView mv = new ModelAndView("/registration");
        return mv;
    }
}
