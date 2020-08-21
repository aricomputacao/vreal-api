package com.asolucao.vreal.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asolucao.vreal.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	
}
