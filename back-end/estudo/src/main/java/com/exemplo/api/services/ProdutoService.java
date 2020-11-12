package com.exemplo.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.exemplo.api.entities.Produto;

@Service
public interface ProdutoService {
	
	/**
	 * Retorna todos Produtos.
	 * 
	 * @return List<Produto>
	 * 
	 */
	List<Produto> findAll();
	
	/**
	 * 
	 * Retorna um produto pelo ID.
	 * 
	 * @param id
	 * return Optional<Produto>
	 */
	Optional<Produto> buscarPorId(Long id);
	
	/**
	 * 
	 * Cadastra um novo Produto na base de dados.
	 * 
	 * @param produto
	 * @return Produto
	 */
	Produto cadastrar(Produto produto);
	
	/**
	 * 
	 * Atualiza um produto.
	 * 
	 * @param id
	 * @param produto
	 * @return produto
	 */
	Produto atualizar(Long id, Produto produto);
	
	/**
	 * 
	 * Deleta um produto.
	 * 
	 * @param id
	 * 
	 */
	void delete(Long id);
}
