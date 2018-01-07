package tr.afu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import tr.afu.dao.UserDao;

@Component
@Scope("request")
public class ControllerBean {
	private String username;
	private String username1;
	private String password;
	@Autowired
	AuthenticationManager auth;

	@Autowired
	UserDao userDao;

	public String login() {
		try {
			SecurityContextHolder.getContext()
					.setAuthentication(auth.authenticate(new UsernamePasswordAuthenticationToken(username1, password)));
		} catch (AuthenticationException e) {
			return null;
		}
		// User user=new User();
		// Role rol=new Role();
		// user.setUserName("asd");
		// user.setPassword("asd");
		// user.setRole(rol);
		// userDao.save(user)
		return "index?faces-redirect=true";
	}

	public String getUsername() {
		if (username == null && SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof UserDetails) {
			UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
					.getPrincipal();
			username = userDetails.getUsername();
		}
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername1() {
		return username1;
	}

	public void setUsername1(String username1) {
		this.username1 = username1;
	}
}
