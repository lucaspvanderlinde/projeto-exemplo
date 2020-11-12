package com.exemplo.api.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.exemplo.api.entities.Produto;
import com.exemplo.api.repositories.ProdutoRepository;
import com.exemplo.api.services.ProdutoService;

public class ProdutoServiceImpl implements ProdutoService {
	
	private static final Logger log = LoggerFactory.getLogger(ProdutoServiceImpl.class);

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	public List<Produto> findAll() {
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
		atualizar(produto, obj);
		return produtoRepository.save(produto);
	}
	
	private void atualizar(Produto produto, Produto obj) {
		produto.setNome(obj.getNome());
		produto.setQuantidade(obj.getQuantidade());
		produto.setDataCadastro(new Date());
	}

	@Override
	public void delete(Long id) {
		log.info("Deletando uma empresa: {}", id);
		this.produtoRepository.deleteById(id);
	}

}
