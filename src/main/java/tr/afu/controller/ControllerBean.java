package tr.afu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import tr.afu.dao.UserDao;
import tr.afu.domain.Role;
import tr.afu.domain.User;

@Component
@Scope("request")
public class ControllerBean {
	private String asd="asd";

	@Autowired
	UserDao userDao;
	
	public String getAsd() {
		return asd;
	}

	public void setAsd(String asd) {
		this.asd = asd;
	}
	@Autowired
	AuthenticationManager auth;
	
	public void asds() {
		
		System.out.println("xdsfsf");
		SecurityContextHolder.getContext().setAuthentication(auth.authenticate(new UsernamePasswordAuthenticationToken("asd", "asd")));
//		User user=new User();
//		Role rol=new Role();
//		user.setUserName("asd");
//		user.setPassword("asd");
//		user.setRole(rol);
//		userDao.save(user);
	}
}
