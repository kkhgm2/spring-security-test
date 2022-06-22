package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthContoller {

	//successForwardUrl がなけれはgetmapping でOK、index.htmlへ遷移
	@GetMapping
    public String index1() {
    	Authentication info = SecurityContextHolder.getContext().getAuthentication();
    	System.out.println(info.getAuthorities());
    	System.out.println(info.getName());
        return "index";
    }
	
	//successForwardUrl はpost でないと受け取らない
	@PostMapping("/test")
    public String index() {
    	System.out.println("aaaaaaaaa");
        return "test";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return  "login";
    }

    @GetMapping("/logout")
    public String logout() {
        return  "logout";
    }
	
//	@Autowired
//	PasswordEncoder passEnco;
	
//    @GetMapping("/login")
//    public String showLoginForm() {
//    	var pass = passEnco.encode("password1234");
//    	
//    	System.out.println(pass);
//        return "login";
//    }

}
