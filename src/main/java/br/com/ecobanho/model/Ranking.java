package br.com.ecobanho.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ranking")
public class Ranking {

//	@Id
//	private long id1;
	
	@Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID uuid;
	
	

	@Column(name="id_grupo")
	private long id_grupo;
	
	@Column(name="nome_usuario")
	private String nome_usuario;
	
	@Column(name="nome_grupo")
	private String nome_grupo;
	
	@Column(name="economia")
	private double economia;

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	
	
	public long getId_gurpo() {
		return id_grupo;
	}

	public void setId_gurpo(long id_grupo) {
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

	public double getEconomia() {
		return economia;
	}

	public void setEconomia(double economia) {
		this.economia = economia;
	}


}
