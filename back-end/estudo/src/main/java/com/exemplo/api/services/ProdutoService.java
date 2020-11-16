package com.exemplo.api.services;

import java.util.List;
import java.util.Optional;

import com.exemplo.api.entities.Produto;

public interface ProdutoService {

	/**
	 * Retorna todos Produtos.
	 * 
	 * @return List<Produto>
	 */
	List<Produto> buscarTodos();

	/**
	 * Retorna um produto pelo ID.
	 * 
	 * @param id return Optional<Produto>
	 */
	Optional<Produto> buscarPorId(Long id);

	/**
	 * Cadastra um novo Produto na base de dados.
	 * 
	 * @param produto
	 * @return Produto
	 */
	Produto cadastrar(Produto produto);

	/**
	 * Atualiza um produto.
	 * 
	 * @param id
	 * @param produto
	 * @return produto
	 */
	Produto atualizar(Long id, Produto produto);

	/**
	 * Deleta um produto.
	 * 
	 * @param id
	 */
	void delete(Long id);

	/**
	 * Método para atualizar um produto.
	 * 
	 * @param produto
	 * @param novoProduto
	 */
	void novoProduto(Produto produto, Produto novoProduto);
}
