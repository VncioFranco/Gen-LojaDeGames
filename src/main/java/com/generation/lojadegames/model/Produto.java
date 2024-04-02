package com.generation.lojadegames.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotBlank(message = " O atributo nome é Obrigatorio")
@Size(min = 2, max = 50, message ="Tamanho minimo: 2, maximo: 50")
private String nome;

@NotBlank(message = " O atributo descrição é Obrigatorio")
@Size(min = 10, max = 1000, message ="Tamanho minimo: 10, maximo: 1000")
private String descricao;

@NotBlank(message = " O atributo console é Obrigatorio")
@Size(min = 5, max = 100, message = "Tamanho minimo 5, maximo: 100")
private String console;

@NotNull(message = " o atributo preço é obrigatorio!")
@Column(precision = 8, scale = 2)
private BigDecimal preco;

@NotNull
private String estudio;

@ManyToOne
@JsonIgnoreProperties("produto")
private Categoria categoria;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public String getConsole() {
	return console;
}

public void setConsole(String console) {
	this.console = console;
}

public BigDecimal getPreco() {
	return preco;
}

public void setPreco(BigDecimal preco) {
	this.preco = preco;
}

public String getEstudio() {
	return estudio;
}

public void setEstudio(String estudio) {
	this.estudio = estudio;
}

public Categoria getCategoria() {
	return categoria;
}

public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}


}
