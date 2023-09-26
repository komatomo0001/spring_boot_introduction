package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.form.SampleForm;

@Controller
@RequestMapping("/lesson")
public class LessonController {
	
	@GetMapping("/sample")
	//@ResponseBody
	public String sample(Model model) {
		String text = "Hello Spring Boot!!";
		model.addAttribute("message", text);
		return "index";
	}
	
	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "Hello World!";
	}
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		return "Good Evening!";
	}
	
	@GetMapping("/request_test")
	@ResponseBody
	public String getTest(@RequestParam("name") String name, @RequestParam("bloodType") String bloodType) {
		return "名前: " + name + "<br>血液型: " + bloodType;
	}
	
	@PostMapping("/request_test")
	@ResponseBody
	 public String postTest(@ModelAttribute SampleForm sampleForm) {
        return "lesson/form_test";
	}
}
