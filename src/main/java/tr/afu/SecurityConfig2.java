package tr.afu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import tr.afu.dao.UserDao;
import tr.afu.service.MyUserDetailsService;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig2
{
//
//	@Autowired
//	UserDao userDao;
//	@Autowired
//	private MyUserDetailsService userDetailsService;
//	 
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth)
//	  throws Exception {
//	    auth.authenticationProvider(authenticationProvider());
//	}
//	 
//	@Bean
//	public DaoAuthenticationProvider authenticationProvider() {
//	    DaoAuthenticationProvider authProvider
//	      = new DaoAuthenticationProvider();
//	    authProvider.setUserDetailsService(userDetailsService);
//	    return authProvider;
//	}
	
//	@Override
//	public void configure(HttpSecurity http) throws Exception {
//		http.antMatcher("/**").authorizeRequests().anyRequest().hasRole("USER")
//				.and().formLogin().loginPage("/login.jsf")
//				.failureUrl("/login.jsp?error=1").loginProcessingUrl("/login")
//				.permitAll().and().logout()
//				.logoutSuccessUrl("/login.jsf");
//
//	}

}
