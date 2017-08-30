package com.lin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lin.domain.User;
import com.lin.service.UserService;

@Controller
public class LoginController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/login")  
    public String login(){    
	
        return "login";  
    }  
}
