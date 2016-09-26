package com.tcs.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.business.AssociateBusinessInterface;
import com.tcs.model.Associate;

@Controller
public class RegisterController {
	
	@Autowired
	private AssociateBusinessInterface business;
	
	@RequestMapping(value = "/")
	public ModelAndView start(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("redirect:/registerGet");
		return model;
	}
	
	@RequestMapping(value = "/registerGet", method = RequestMethod.GET)
	public ModelAndView registerGet(HttpServletRequest request, HttpServletResponse response)
	{
		System.out.println("In registerGet");
		ModelAndView model = new ModelAndView("register");
		return model;
	}
	
	@RequestMapping(value = "/registerPost")
	public ModelAndView reisterPost(HttpServletRequest request, HttpServletResponse response)
	{
		System.out.println("In registerPost");
		int result = 0;
		ModelAndView model = new ModelAndView("result");
		
		String username = request.getParameter("username");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String password = request.getParameter("password");
		
		String salt = business.saltInput().toString();
		String hashPassword = business.hashPassword(password, salt);
		
		Associate associate = new Associate();
		associate.setUsername(username);
		associate.setFirstName(fname);
		associate.setLastName(lname);
		associate.setPassword(hashPassword);
		associate.setEnabled(true);
		
		result = business.saveAssociate(associate, salt);
		if(result > 0)
		{
			model.addObject("title", "Registration Success !!");
			model.addObject("message", "The associate has been successfully added to Database !");
		}
		else
		{
			model.addObject("title", "Registration Failure !!");
			model.addObject("message", "Something went wrong. Please try again !!");
		}
		
		return model;
	}

}
