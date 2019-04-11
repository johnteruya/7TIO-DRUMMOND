package br.com.ecobanhoapp.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;




@Entity
public class Chuveiro implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id_chuveiro;
		
	@NotEmpty
	private String tipo_chuveiro;
	
	@NotEmpty
	private Float vazao;

	
	public int getId_chuveiro() {
		return id_chuveiro;
	}

	public void setId_chuveiro(int id_chuveiro) {
		this.id_chuveiro = id_chuveiro;
	}

	public String getTipo_chuveiro() {
		return tipo_chuveiro;
	}

	public void setTipo_chuveiro(String tipo_chuveiro) {
		this.tipo_chuveiro = tipo_chuveiro;
	}

	public Float getVazao() {
		return vazao;
	}

	public void setVazao(Float vazao) {
		this.vazao = vazao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}