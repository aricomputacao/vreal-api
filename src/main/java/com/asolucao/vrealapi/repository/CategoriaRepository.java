package com.asolucao.vrealapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asolucao.vrealapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	
}
