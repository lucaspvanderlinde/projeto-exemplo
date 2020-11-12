package com.exemplo.api.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto implements Serializable {

	private static final long serialVersionUID = -3266463164979693656L;

	private Long id;
	private String nome;
	private int quantidade;
	private Date dataCadastro;

	public Produto(Long id, String nome, int quantidade, Date dataCadastro) {
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.dataCadastro = dataCadastro;
	}

	public Produto() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "nome", nullable = false)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "quantidade", nullable = false)
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Column(name = "data_cadastro", nullable = false)
	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@PrePersist
	public void prePersist() {
		final Date dataAtual = new Date();
		dataCadastro = dataAtual;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", quantidade=" + quantidade + ", dataCadastro=" + dataCadastro
				+ "]";
	}
}
