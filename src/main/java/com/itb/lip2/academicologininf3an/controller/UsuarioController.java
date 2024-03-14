package com.itb.lip2.academicologininf3an.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itb.lip2.academicologininf3an.model.Usuario;
import com.itb.lip2.academicologininf3an.service.UsuarioService;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/users")
	public List<Usuario> getUsers() {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		Usuario us1 = new Usuario();
		us1.setId(1l);
		us1.setNome("Rogério Caetano");
		us1.setEmail("rogerio@gmail.com");
		
		Usuario us2 = new Usuario();
		us2.setId(2l);
		us2.setNome("Júlia Souza");
		us2.setEmail("julia@gmail.com");
		
		usuarios.add(us1);
		usuarios.add(us2);
		
		
		return usuarios;
		
	}
	
	@PostMapping("/users")
	public ResponseEntity<Usuario> saveUser(@RequestBody Usuario usuario) {
		
		return ResponseEntity.ok().body(usuarioService.save(usuario));
	}
	
	
	

}
