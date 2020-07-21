package com.javatpoint;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		// setting the data
		modelAndView.addObject("name", "Sojib");
		modelAndView.addObject("rollnumber", 11294);
		LocalDateTime time = LocalDateTime.now();
		modelAndView.addObject("time", time);
		// Marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);

		modelAndView.addObject("marks", list);

		// setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
