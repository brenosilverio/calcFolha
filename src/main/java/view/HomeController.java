package view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value = {"/"})
	public ModelAndView index(){
		System.out.println("HomeController");
		return new ModelAndView("/home");
	}
}
