package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	//@Param(por causa da consulta tipo LIKE)  T  e ID os roxos , titulo é mudavel  
	List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo); 
	// é um metodo de consula ^ ^ 
	// SELECT * FROM tb_postagens WHERE titulo LIKE "%????%"; sql
}
