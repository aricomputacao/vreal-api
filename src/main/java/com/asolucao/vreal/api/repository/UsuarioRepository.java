package com.asolucao.vreal.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asolucao.vreal.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByEmail(String email);
}
