package com.spring.tutorial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.tutorial.repositoriy.InMemoryPersistence;

@Controller
@RequestMapping("/home")
public class ControllerBasic {
	
	@Autowired
	InMemoryPersistence post;
	
	@GetMapping(path = {"/post", "/"})
	public String saludo(Model model) {
		model.addAttribute("posts", post.getPosts());
		return "index";
	}

}
