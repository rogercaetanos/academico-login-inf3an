package com.itb.lip2.academicologininf3an.service;

import java.util.List;
import java.util.Optional;

import com.itb.lip2.academicologininf3an.model.Usuario;

public interface UsuarioService {
	
	Usuario save(Usuario usuario);
	List<Usuario> findAll();

	Optional<Usuario> findById(Long id);

}
