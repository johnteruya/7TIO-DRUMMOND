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
@Table(name = "chuveiro")
@EntityListeners(AuditingEntityListener.class)
public class Chuveiro {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_chuveiro;

	@Column(nullable=false)
    private String tipo_chuveiro;
    
	@Column(nullable=false)
	private int vazao;

	
	public Long getId_chuveiro() {
		return id_chuveiro;
	}

	public void setId_chuveiro(Long id_chuveiro) {
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
