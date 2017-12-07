package com.example.contro;


import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.UserService;


@Controller
public class ControllerTest {

	@Autowired
	UserService userService;
	
	/**
	 * 当请求为login时，将页面跳转到Login
	 * @return
	 * ,method=RequestMethod.GET
	 */
	@RequestMapping(value="login")
	public String Login() {
		return "Login";
	}
	/**
	 * 请求 跳转
	 * @return
	 */
	 
//	@RequestMapping(value={"/welcome","/"},method=RequestMethod.GET)
	@RequestMapping("/")
	public String test() {
		return "Index";
	}
	
	@RequestMapping("/admin/tt")
	public String Tt() {
		return "tt";
	}

	@RequestMapping("/function")
	public String Fun() {
		userService.addUser();
		return "tt";
	}
}
