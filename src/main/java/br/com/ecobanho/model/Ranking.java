package br.com.ecobanho.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="ranking")
public class Ranking {
	
	
	@NotNull
	@Column(name="NOME_USUARIO")
	private String nome_usuario;
	
	@NotNull
	@Column(name="NOME_GRUPO")
	private String nome_grupo;
	
	
	@NotNull
	@Column(name="ID_GRUPO")
	private Long nickname;
	
	
	@NotNull
	@Column(name="ECONOMIA")
	private int economia;


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


	public Long getNickname() {
		return nickname;
	}


	public void setNickname(Long nickname) {
		this.nickname = nickname;
	}


	public int getEconomia() {
		return economia;
	}


	public void setEconomia(int economia) {
		this.economia = economia;
	}
	

}