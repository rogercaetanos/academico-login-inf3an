package com.itb.lip2.academicologininf3an.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	
	@GetMapping("/users")
	public String getUsers() {
		
		return "Lista de Usuários";
		
	}

}
