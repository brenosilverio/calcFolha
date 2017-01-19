package conf;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackages = {"conf", "view", "model", "service", "dao"})
public class AppWebConfiguration {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver (){
		 InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		 viewResolver.setPrefix("/WEB-INF/views/");
		 viewResolver.setSuffix(".jsp");
		 
		 return viewResolver;
	}
	
	@Bean
	public MessageSource messageSource () {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("/resources/messages");
		messageSource.setDefaultEncoding("UTF-8");
		messageSource.setCacheSeconds(1);
		return messageSource;
	}
}
