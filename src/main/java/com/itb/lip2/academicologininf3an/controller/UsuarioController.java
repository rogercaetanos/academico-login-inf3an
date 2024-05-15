package com.itb.lip2.academicologininf3an.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.itb.lip2.academicologininf3an.model.Usuario;
import com.itb.lip2.academicologininf3an.service.UsuarioService;

@RestController
@RequestMapping("/academico/api/v1")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/users")
	public ResponseEntity<List<Usuario>> getUsers() {

		return ResponseEntity.ok().body(usuarioService.findAll());

	}

	@PostMapping("/users")
	public ResponseEntity<Usuario> saveUser(@RequestBody Usuario usuario) {

		URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/academico/api/v1/users").toUriString());
		return ResponseEntity.created(uri).body(usuarioService.save(usuario));

	}

	@GetMapping("/users/{id}")
	public ResponseEntity<Usuario> findUsuarioById(@PathVariable(value = "id") Long id) {

		return ResponseEntity.ok().body(usuarioService.findById(id).get());

	}




}