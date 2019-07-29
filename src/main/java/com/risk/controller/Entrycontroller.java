package com.risk.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.risk.model.User;

@Controller
public class Entrycontroller {
	
	@RequestMapping(value = "/")
	public String register(Model model)
	{
	model.addAttribute("data",new User());
	
	return "register";
	}
	
	@RequestMapping(value = "/success_register", method = RequestMethod.POST)
	public String registerSuccess(@Valid @ModelAttribute("data") User user, BindingResult result) {

		/*
		 * if (user.getName().isEmpty()) { throw new RuntimeException(); }
		 */
		
		if (result.hasErrors()) {
			return "register";
		}
		
		//userService.addUserList(user);
		return "redirect:/listUsers";
	
}
	/*
	 * @ExceptionHandler(value = RuntimeException.class) public String
	 * myExceptionClass() { return "exception"; }
	 */
	
}
