package com.digitalnation.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.net.URI;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;    
@Controller
public class LoginController {


	@RequestMapping("/")    
	public String index()  
	{    
	return"login";    
	}    

	@RequestMapping(value="/Fisier")    
	public ModelAndView save(@ModelAttribute User user)  
	{    
		ModelAndView modelAndView = new ModelAndView();    
		modelAndView.setViewName("home");        
		modelAndView.addObject("user", user);      
		return modelAndView;    
	}    
	 @RequestMapping(value="/CV")
	 public ModelAndView cv(@ModelAttribute User user)
	 {
		 ModelAndView modandview = new ModelAndView();
		 modandview.setViewName("CV");
		 modandview.addObject("user", user);
		 return modandview;
	 }
	}

