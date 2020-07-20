package com.javatpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Md. Sojib");
		model.addAttribute("id", 11294);
		List<String> friends = new ArrayList<String>();
		friends.add("Rana");
		friends.add("Sagor");
		friends.add("Fakhrul");
		friends.add("Fakhrul");
		friends.add("F");
		model.addAttribute("f", friends);
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}
}
