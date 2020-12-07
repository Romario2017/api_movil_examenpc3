package com.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.entity.Autor;
import com.biblioteca.repository.AutorRepository;

@Service
public class AutorServiceImpl implements AutorService {
	
	@Autowired
	private AutorRepository repository;
	
	@Override
	public List<Autor> listaAutor() {
		return repository.findAll();
	}
	
	@Override
	public List<Autor> listaAutorPorNombre(String nombre) {
		return repository.listaPorNombre(nombre);
	}
}
