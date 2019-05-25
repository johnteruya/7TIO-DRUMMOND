package br.com.ecobanho.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="historico")
public class Historico {

	@Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID uuid;
	
	@Column(name="ID_USUARIO")
	private long id_usuario;
	
	
	@NotNull
	@Column(name="NOME_USUARIO")
	private String nome_usuario;
	
	@NotNull
	@Column(name="NICKNAME")
	private String nickname;
	
	@NotNull
	@Column(name="ECONOMIA")
	private String economia;
	
	@NotNull
	@Column(name="DATA_BANHO")
	private String data_banho;

	
	
	
	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEconomia() {
		return economia;
	}

	public void setEconomia(String economia) {
		this.economia = economia;
	}

	public String getData_banho() {
		return data_banho;
	}

	public void setData_banho(String data_banho) {
		this.data_banho = data_banho;
	}
}