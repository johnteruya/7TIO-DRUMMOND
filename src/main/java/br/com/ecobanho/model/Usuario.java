package br.com.ecobanho.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "usuario")
@EntityListeners(AuditingEntityListener.class)
public class Usuario {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

	@Column(nullable=false)
	private String nickname;

	@Column(nullable=false)
	private String nome_usuario;
	
	@Column(nullable=false)
	private boolean sexo;
	
	@Column(nullable=false)
	private int tempo_usual;
	
	@Column(nullable=false)
	private int fk_id_grupo;
	
	@Column(nullable=false)
	private int fk_tipo_chuveiro;

	public Long getId_usuario() {
		return id_usuario;
	}

	
	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public int getTempo_usual() {
		return tempo_usual;
	}

	public void setTempo_usual(int tempo_usual) {
		this.tempo_usual = tempo_usual;
	}

	public int getFk_id_grupo() {
		return fk_id_grupo;
	}

	public void setFk_id_grupo(int fk_id_grupo) {
		this.fk_id_grupo = fk_id_grupo;
	}

	public int getFk_tipo_chuveiro() {
		return fk_tipo_chuveiro;
	}

	public void setFk_tipo_chuveiro(int fk_tipo_chuveiro) {
		this.fk_tipo_chuveiro = fk_tipo_chuveiro;
	}
	
}