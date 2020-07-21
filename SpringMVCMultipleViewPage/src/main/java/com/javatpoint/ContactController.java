package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String ahowForm() {
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam(name = "email", required = true) String userEmail,
			@RequestParam("userName") String userName, // if parameter int,than we can write int userNameit will auto
														// typecast
			@RequestParam("userPassword") String userPassword, Model model) {

		System.out.println("email=" + userEmail);
		System.out.println("userName=" + userName);
		System.out.println("userPassword=" + userPassword);

		// process

		model.addAttribute("email", userEmail);
		model.addAttribute("userName", userName);
		model.addAttribute("userPassword", userPassword);
		return "success";
	}
}
