package com.groupeisi.scolantein.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Login {
	
@GetMapping("/home")
public String home() {
	return "Bienvenu !!";
}
}
