package trng.samp.rest.configuration;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Configuration
@EnableWebMvc
@ComponentScan("trng.samp.rest")
public class MvcConfig extends WebMvcAutoConfiguration {
	
	public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("", "index.jsp");
        
    }

}
