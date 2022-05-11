package com.generation.lojadegames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String aventura;
	
	@NotNull
	private String terror;
	
	@NotNull
	private String infantil;
	
	@OneToMany(mappedBy="categoria" , cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Produtos> produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAventrura() {
		return aventura;
	}

	public void setAventrura(String aventrura) {
		this.aventura = aventrura;
	}

	public String getTerror() {
		return terror;
	}

	public void setTerror(String terror) {
		this.terror = terror;
	}

	public String getInfantil() {
		return infantil;
	}

	public void setInfantil(String infantil) {
		this.infantil = infantil;
	}

	public List<Produtos> getProduto() {
		return produto;
	}

	public void setProduto(List<Produtos> produto) {
		this.produto = produto;
	}
	
	
	
}
	