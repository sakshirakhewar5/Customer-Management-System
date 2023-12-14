package com.SunBaseData.SunBaseDataAssesment.Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SunBaseData.SunBaseDataAssesment.POJO.LoginData;

@Controller
public class LoginController {
	@Autowired
	SessionFactory sf;

	@RequestMapping("loginform")
	public String login() {
		return "Login";
	}
	@RequestMapping("/Login")
	public String logindata(LoginData login) {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(login);
		t.commit();
		return "Login";
	}
	
	
}
  