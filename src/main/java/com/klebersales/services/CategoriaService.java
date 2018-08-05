package com.klebersales.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klebersales.domain.Categoria;
import com.klebersales.repositories.CategoriaRepository;
import com.klebersales.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado! ID: " + id + ", Tipo: " + Categoria.class.getName()));
					
	}
}
