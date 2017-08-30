package com.lin.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lin.domain.User;
import com.lin.service.UserService;

/**
 * 功能概要：UserController
 * 
 * @author linbingwen
 * @since  2015年9月28日 
 */
@Controller
public class registerController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/register")  
    public ModelAndView register(){    
		ModelAndView mav = new ModelAndView("register"); 
		User user = userService.selectUserById(1);
	    mav.addObject("user", user); 
        return mav;  
    }  
//	@RequestMapping("/registerTest")  
//    public ModelAndView registerTest(){    
//		ModelAndView mav = new ModelAndView("success"); 
//		User user = userService.selectUserById(1);
//	    mav.addObject("user", user); 
//        return mav;  
//    } 
	@RequestMapping("/registerTest")  
    public String registerTest(){  
		User user = new User();
		user.setUserName("test");
		user.setUserEmail("QQ@163.com");
		user.setUserPassword("123");
		int i= userService.addUser(user);
		System.out.println("是否成功："+i);
        return "success";  
    } 
}
