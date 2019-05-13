package br.com.ecobanho.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;

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
	private String sexo;
	
	@Column(nullable=false)
	private Long tempo_usual;
	
	@Column(nullable=false)
	private int fk_tipo_chuveiro;
	
	private int fk_id_grupo;

	
	
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Long getTempo_usual() {
		return tempo_usual;
	}

	public void setTempo_usual(Long tempo_usual) {
		this.tempo_usual = tempo_usual;
	}

	public int getFk_tipo_chuveiro() {
		return fk_tipo_chuveiro;
	}

	public void setFk_tipo_chuveiro(int fk_tipo_chuveiro) {
		this.fk_tipo_chuveiro = fk_tipo_chuveiro;
	}

	public int getFk_id_grupo() {
		return fk_id_grupo;
	}

	public void setFk_id_grupo(int fk_id_grupo) {
		this.fk_id_grupo = fk_id_grupo;
	}

}