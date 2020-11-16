package com.exemplo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.api.entities.Produto;
import com.exemplo.api.services.ProdutoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	
	/**
	 * Lista todos os produtos que estão no banco.
	 * 
	 * @return ResponseEntity<List<Produto>>
	 */
	
	@GetMapping
	public ResponseEntity<List<Produto>> buscarTodos() {
		List<Produto> lista = produtoService.buscarTodos();
		return ResponseEntity.ok().body(lista);
	}

}
