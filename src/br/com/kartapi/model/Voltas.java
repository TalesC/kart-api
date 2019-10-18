package br.com.kartapi.model;

import java.time.LocalTime;

public class Voltas {
	
	private LocalTime horaTermino;
	private LocalTime tempoVolta;
	private Double velocidadeMedia;
	private Integer numeroVolta;
	
	public Voltas() {
	}
	
	public Voltas(LocalTime horaTermino, LocalTime tempoVolta, Double velocidadeMedia, Integer numeroVolta) {
		super();
		this.horaTermino = horaTermino;
		this.tempoVolta = tempoVolta;
		this.velocidadeMedia = velocidadeMedia;
		this.numeroVolta = numeroVolta;
	}

	public LocalTime getHoraTermino() {
		return horaTermino;
	}
	public void setHoraTermino(LocalTime horaTermino) {
		this.horaTermino = horaTermino;
	}
	public LocalTime getTempoVolta() {
		return tempoVolta;
	}
	public void setTempoVolta(LocalTime tempoVolta) {
		this.tempoVolta = tempoVolta;
	}
	public Double getVelocidadeMedia() {
		return velocidadeMedia;
	}
	public void setVelocidadeMedia(Double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	public Integer getNumeroVolta() {
		return numeroVolta;
	}

	public void setNumeroVolta(Integer numeroVolta) {
		this.numeroVolta = numeroVolta;
	}

	@Override
	public String toString() {
		return "Voltas [horaTermino=" + horaTermino + ", tempoVolta=" + tempoVolta + ", velocidadeMedia="
				+ velocidadeMedia + ", numeroVolta=" + numeroVolta + "]";
	}
	
}
