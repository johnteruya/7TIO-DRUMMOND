package br.com.ecobanho.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "banho")
@EntityListeners(AuditingEntityListener.class)
public class Banho {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_banho;

	@Column(nullable=false)
	private Date data_banho;

	@Column(nullable=false)
	private int tempo_real;
	
	@Column(nullable=false)
	private int consumo_real;
	
	@Column(nullable=false)
	private int tempo_ideal;
	
	@Column(nullable=false)
	private int consumo_ideal;
	
	@Column(nullable=false)
	private int economia;
	
	@Column(nullable=false)
	private int fk_usuario;
	
	@Column(nullable=false)
	private int fk_chuveiro;

	public Long getId_banho() {
		return id_banho;
	}

	public void setId_banho(Long id_banho) {
		this.id_banho = id_banho;
	}

	public Date getData_banho() {
		return data_banho;
	}

	public void setData_banho(Date data_banho) {
		this.data_banho = data_banho;
	}

	public int getTempo_real() {
		return tempo_real;
	}

	public void setTempo_real(int tempo_real) {
		this.tempo_real = tempo_real;
	}

	public int getConsumo_real() {
		return consumo_real;
	}

	public void setConsumo_real(int consumo_real) {
		this.consumo_real = consumo_real;
	}

	public int getTempo_ideal() {
		return tempo_ideal;
	}

	public void setTempo_ideal(int tempo_ideal) {
		this.tempo_ideal = tempo_ideal;
	}

	public int getConsumo_ideal() {
		return consumo_ideal;
	}

	public void setConsumo_ideal(int consumo_ideal) {
		this.consumo_ideal = consumo_ideal;
	}

	public int getEconomia() {
		return economia;
	}

	public void setEconomia(int economia) {
		this.economia = economia;
	}

	public int getFk_usuario() {
		return fk_usuario;
	}

	public void setFk_usuario(int fk_usuario) {
		this.fk_usuario = fk_usuario;
	}

	public int getFk_chuveiro() {
		return fk_chuveiro;
	}

	public void setFk_chuveiro(int fk_chuveiro) {
		this.fk_chuveiro = fk_chuveiro;
	}
	
	

}