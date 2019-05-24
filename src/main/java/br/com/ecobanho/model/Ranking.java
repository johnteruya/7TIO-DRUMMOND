package br.com.ecobanho.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ranking")
public class Ranking {
    
	@NotNull
	@Column(name="id_grupo")
	private Long id_grupo;
	
	@NotNull
	@Column(name="nome_usuario")
    private String nome_usuario;

	@NotNull
	@Column(name="nome_grupo")
	private String nome_grupo;
	
	@NotNull
	@Column(name="economia")
	private Double economia;

	public Long getId_grupo() {
		return id_grupo;
	}

	public void setId_grupo(Long id_grupo) {
		this.id_grupo = id_grupo;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getNome_grupo() {
		return nome_grupo;
	}

	public void setNome_grupo(String nome_grupo) {
		this.nome_grupo = nome_grupo;
	}

	public Double getEconomia() {
		return economia;
	}

	public void setEconomia(Double economia) {
		this.economia = economia;
	}
	
}