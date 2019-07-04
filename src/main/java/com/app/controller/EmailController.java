package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.Email;
import com.app.util.EmailUtil;

@Controller
public class EmailController {
	
	@Autowired
	private EmailUtil mailUtil;
	
	@RequestMapping("/reg")
	public String saveEmail(Model map) {
		map.addAttribute("email", new Email());		
		return "Message";	
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveMessage(@ModelAttribute Email email, @RequestParam MultipartFile fileOb, Model map ) {
		mailUtil.send(email.getTo(), email.getCc(), email.getBcc(), email.getSubject(),email.getText(), fileOb);
		map.addAttribute("message", "SuccessFul");
		map.addAttribute("email", new Email());	
		return "Message";
		
	}
}
