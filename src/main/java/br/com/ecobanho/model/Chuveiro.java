package br.com.ecobanho.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Chuveiro")
@EntityListeners(AuditingEntityListener.class)

public class Chuveiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_chuveiro;

    @NotBlank
    private String tipo_chuveiro;

    @NotBlank
    private int vazao;

	public long getId_chuveiro() {
		return id_chuveiro;
	}

	public void setId_chuveiro(long id_chuveiro) {
		this.id_chuveiro = id_chuveiro;
	}

	public String getTipo_chuveiro() {
		return tipo_chuveiro;
	}

	public void setTipo_chuveiro(String tipo_chuveiro) {
		this.tipo_chuveiro = tipo_chuveiro;
	}

	public int getVazao() {
		return vazao;
	}

	public void setVazao(int vazao) {
		this.vazao = vazao;
	}

    
    

    
}
