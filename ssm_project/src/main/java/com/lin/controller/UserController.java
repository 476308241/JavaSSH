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
public class UserController {
	@Resource
	private UserService userService;
	

	@RequestMapping("/uploadPage")  
    public ModelAndView gettest(HttpServletRequest request){    
		String path = request.getParameter("path") + "111";
		ModelAndView mav = new ModelAndView("uploadPage"); 
		User user = userService.selectUserById(1);
	    mav.addObject("user", user); 
	    mav.addObject("path", path);
        return mav;  
    }  
	
}
