package br.com.kartapi.model;

import java.time.LocalTime;

public class DadosLog {
	
	private LocalTime horaTerminoVolta;
	private String nomePiloto;
	private Integer codigoPiloto;
	private Integer numeroVolta;
	private LocalTime tempoVolta;
	private Double velocidadeMediaVolta;
	
	
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
	public Double getVelocidadeMediaVolta() {
		return velocidadeMediaVolta;
	}
	public void setVelocidadeMediaVolta(Double velocidadeMediaVolta) {
		this.velocidadeMediaVolta = velocidadeMediaVolta;
	}
	@Override
	public String toString() {
		return "DadosLog [horaTerminoVolta=" + horaTerminoVolta + ", nomePiloto=" + nomePiloto + ", codigoPiloto="
				+ codigoPiloto + ", numeroVolta=" + numeroVolta + ", tempoVolta=" + tempoVolta
				+ ", velocidadeMediaVolta=" + velocidadeMediaVolta + "]";
	}
	
	
}
