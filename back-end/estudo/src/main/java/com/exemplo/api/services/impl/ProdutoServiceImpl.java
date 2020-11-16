package com.exemplo.api.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemplo.api.entities.Produto;
import com.exemplo.api.repositories.ProdutoRepository;
import com.exemplo.api.services.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	private static final Logger log = LoggerFactory.getLogger(ProdutoServiceImpl.class);

	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public List<Produto> buscarTodos() {
		log.info("Buscanto todos os produtos");
		return produtoRepository.findAll();
	}

	@Override
	public Optional<Produto> buscarPorId(Long id) {
		log.info("Buscando um produto pelo ID: {}", id);
		Optional<Produto> produto = produtoRepository.findById(id);
		return produto;
	}

	@Override
	public Produto cadastrar(Produto produto) {
		log.info("Cadastrando produto: {}", produto);
		return this.produtoRepository.save(produto);
	}

	@Override
	public Produto atualizar(Long id, Produto obj) {
		log.info("Atualizando produto: {}", obj);
		Produto produto = produtoRepository.getOne(id);
		novoProduto(produto, obj);
		return produtoRepository.save(produto);
	}

	@Override
	public void delete(Long id) {
		log.info("Deletando uma empresa: {}", id);
		this.produtoRepository.deleteById(id);
	}

	@Override
	public void novoProduto(Produto produto, Produto novoProduto) {
		produto.setNome(novoProduto.getNome());
		produto.setQuantidade(novoProduto.getQuantidade());
		produto.setDataCadastro(new Date());
	}
}
