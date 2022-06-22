package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.reposiotry.SampleMapper;

@Controller
@RequestMapping("/sample")
public class SampleController {

	@Autowired
	SampleMapper map;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("userList", map.getAllUser());
		
		
		return "sample/index";
	}
}
