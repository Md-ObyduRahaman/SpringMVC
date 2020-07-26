package com.javatpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javatpoint.model.User;
import com.javatpoint.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header", "Sojib code");
		model.addAttribute("Desc", "Home for programmer");
	}

	@RequestMapping("/contact")
	public String showForm(Model model) {
		/*
		 * optional model.
		 *
		 *
		 *
		 * addAttribute("Header", "Sojib code"); model.addAttribute("Desc",
		 * "Home for programmer");
		 */
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		/*
		 * optional model.
		 *
		 *
		 *
		 * addAttribute("Header", "Sojib code"); model.addAttribute("Desc",
		 * "Home for programmer");
		 */
		if (user.getUserName().isEmpty()) {
			return "redirect:/contact";

		}
		int creatUser = this.userService.creatUser(user);
		model.addAttribute("msg", "User created with id " + creatUser);

		// process
		return "success";
	}

	// Optional
	// Optional
	// Optional
	// Optional

	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam(name = "email", required = true) String
	 * userEmail,
	 *
	 * @RequestParam("userName") String userName, // if parameter int,than we can
	 * write int userNameit will auto // typecast
	 *
	 * @RequestParam("userPassword") String userPassword, Model model) {
	 *
	 * User user = new User(); user.setEmail(userEmail); user.setUserName(userName);
	 * user.setUserPassword(userPassword);
	 *
	 * System.out.println(user); // process
	 *
	 * model.addAttribute("user", user); return "success"; }
	 */
}
