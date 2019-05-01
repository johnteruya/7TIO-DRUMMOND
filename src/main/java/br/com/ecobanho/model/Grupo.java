package br.com.ecobanho.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "grupo")
@EntityListeners(AuditingEntityListener.class)
public class Grupo {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_grupo;

	@Column(nullable=false)
	private String nome_grupo;

	@Column(nullable=false)
	private int num_integrantes;

    
	public Long getId_grupo() {
		return id_grupo;
	}

	public void setId_grupo(Long id_grupo) {
		this.id_grupo = id_grupo;
	}

	public String getNome_grupo() {
		return nome_grupo;
	}

	public void setNome_grupo(String nome_grupo) {
		this.nome_grupo = nome_grupo;
	}

	public int getNum_integrantes() {
		return num_integrantes;
	}

	public void setNum_integrantes(int num_integrantes) {
		this.num_integrantes = num_integrantes;
	}



}
