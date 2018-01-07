package tr.afu;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.ServletContextAware;

import com.sun.faces.config.ConfigureListener;


@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootJdbcApplication implements ServletContextAware  {
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	 @Bean
	    public ServletRegistrationBean facesServletRegistration() {
	        ServletRegistrationBean registration = new ServletRegistrationBean(
	            new FacesServlet(), "*.jsf");
	        registration.setLoadOnStartup(1);
	        return registration;
	    }

	    @Bean
	    public ServletListenerRegistrationBean<ConfigureListener> jsfConfigureListener() {
	        return new ServletListenerRegistrationBean<ConfigureListener>(
	            new ConfigureListener());
	    }

	    @Override
	    public void setServletContext(ServletContext servletContext) {
	        servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());       
	    }
	
}