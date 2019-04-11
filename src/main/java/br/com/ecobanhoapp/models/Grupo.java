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
public class Grupo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id_grupo;
		
	@NotEmpty
	private String nome_grupo;
	
	@NotEmpty
	private int numero_integrantes;

	public int getId_grupo() {
		return id_grupo;
	}

	
	
	public void setId_grupo(int id_grupo) {
		this.id_grupo = id_grupo;
	}

	public String getNome_grupo() {
		return nome_grupo;
	}

	public void setNome_grupo(String nome_grupo) {
		this.nome_grupo = nome_grupo;
	}

	public int getNumero_integrantes() {
		return numero_integrantes;
	}

	public void setNumero_integrantes(int numero_integrantes) {
		this.numero_integrantes = numero_integrantes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}