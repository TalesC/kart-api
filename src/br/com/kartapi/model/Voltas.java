package br.com.kartapi.model;

import java.time.LocalTime;

public class Voltas {
	
	private LocalTime horaTermino;
	private LocalTime tempoVolta;
	private Float velocidadeMedia;
	
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
	public Float getVelocidadeMedia() {
		return velocidadeMedia;
	}
	public void setVelocidadeMedia(Float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

}
