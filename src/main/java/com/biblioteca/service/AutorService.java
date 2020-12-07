package com.biblioteca.service;

import java.util.List;

import com.biblioteca.entity.Autor;

public interface AutorService {

	public List<Autor> listaAutor();
	public List<Autor> listaAutorPorNombre(String nombre);
}
