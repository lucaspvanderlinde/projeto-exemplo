package com.exemplo.api.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "produto")
public class Produto implements Serializable {

	private static final long serialVersionUID = -3266463164979693656L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	private Long id;

	@Column(name = "nome", nullable = false)
	@Getter
	@Setter
	private String nome;

	@Column(name = "quantidade", nullable = false)
	@Getter
	@Setter
	private int quantidade;

	@Column(name = "data_cadastro", nullable = false)
	@Getter
	@Setter
	private Date dataCadastro;
}