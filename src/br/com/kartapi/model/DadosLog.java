package br.com.kartapi.model;

import java.time.LocalTime;

public class DadosLog {
	
	private LocalTime horaTerminoVolta;
	private String nomePiloto;
	private Integer codigoPiloto;
	private Integer numeroVolta;
	private LocalTime tempoVolta;
	private Float velocidadeMediaVolta;
	
	
	public LocalTime getHoraTerminoVolta() {
		return horaTerminoVolta;
	}
	public void setHoraTerminoVolta(LocalTime horaTerminoVolta) {
		this.horaTerminoVolta = horaTerminoVolta;
	}
	public String getNomePiloto() {
		return nomePiloto;
	}
	public void setNomePiloto(String nomePiloto) {
		this.nomePiloto = nomePiloto;
	}
	public Integer getCodigoPiloto() {
		return codigoPiloto;
	}
	public void setCodigoPiloto(Integer codigoPiloto) {
		this.codigoPiloto = codigoPiloto;
	}
	public Integer getNumeroVolta() {
		return numeroVolta;
	}
	public void setNumeroVolta(Integer numeroVolta) {
		this.numeroVolta = numeroVolta;
	}
	public LocalTime getTempoVolta() {
		return tempoVolta;
	}
	public void setTempoVolta(LocalTime tempoVolta) {
		this.tempoVolta = tempoVolta;
	}
	public Float getVelocidadeMediaVolta() {
		return velocidadeMediaVolta;
	}
	public void setVelocidadeMediaVolta(Float velocidadeMediaVolta) {
		this.velocidadeMediaVolta = velocidadeMediaVolta;
	}
	
}
