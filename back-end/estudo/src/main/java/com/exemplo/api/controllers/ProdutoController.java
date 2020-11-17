package com.exemplo.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	/**
	 * Busca um produto que está no banco pelo id.
	 * 
	 * @param id
	 * @return ResponseEntity<Produto>
	 */
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Produto>> buscarPorId(@PathVariable Long id) {
		Optional<Produto> produto = produtoService.buscarPorId(id);
		return ResponseEntity.ok().body(produto);
	}

	/**
	 * Cadastra um produto novo no banco.
	 * 
	 * @param produto
	 * @return ResponseEntity<Produto>
	 */
	@PostMapping
	public ResponseEntity<Produto> cadastrar(@RequestBody Produto produto) {
		produto = produtoService.cadastrar(produto);
		return ResponseEntity.ok().body(produto);
	}

	/**
	 * Deleta um produto do banco.
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		produtoService.delete(id);
		return ResponseEntity.noContent().build();
	}

	/**
	 * Altera um produto do banco pelo id.
	 * 
	 * @param id
	 * @param produto
	 * @return
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<Produto> atualizar(@PathVariable Long id, @RequestBody Produto produto) {
		produto = produtoService.atualizar(id, produto);
		return ResponseEntity.ok().body(produto);
	}

}
