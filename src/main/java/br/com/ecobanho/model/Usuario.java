package br.com.ecobanho.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
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
	private Long tempo_usual;
	
	@Column(nullable=false)
	private Long fk_id_grupo;
	
	@Column(nullable=false)
	private String fk_tipo_chuveiro;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_tipo_chuveiro", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Chuveiro chuveiro;

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

	public boolean getSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public Long getTempo_usual() {
		return tempo_usual;
	}

	public void setTempo_usual(Long tempo_usual) {
		this.tempo_usual = tempo_usual;
	}

	public Long getFk_id_grupo() {
		return fk_id_grupo;
	}

	public void setFk_id_grupo(Long fk_id_grupo) {
		this.fk_id_grupo = fk_id_grupo;
	}
	
	public Chuveiro getChuveiro() {
		return chuveiro;
	}

	public void setChuveiro(Chuveiro chuveiro) {
		this.chuveiro = chuveiro;
	}

}