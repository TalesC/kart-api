package br.com.kartapi.model;

import java.time.LocalTime;

public class KartInput {

	private LocalTime horaChegada;
	private Integer nrPiloto;
	private String nomePiloto;
	private Integer nrVoltas;
	private LocalTime tempVolta;
	private Float velocidadeMedia;
	
	
	public LocalTime getHoraChegada() {
		return horaChegada;
	}
	public void setHoraChegada(LocalTime horaChegada) {
		this.horaChegada = horaChegada;
	}
	public Integer getNrPiloto() {
		return nrPiloto;
	}
	public void setNrPiloto(Integer nrPiloto) {
		this.nrPiloto = nrPiloto;
	}
	public String getNomePiloto() {
		return nomePiloto;
	}
	public void setNomePiloto(String nomePiloto) {
		this.nomePiloto = nomePiloto;
	}
	public Integer getNrVoltas() {
		return nrVoltas;
	}
	public void setNrVoltas(Integer nrVoltas) {
		this.nrVoltas = nrVoltas;
	}
	public LocalTime getTempVolta() {
		return tempVolta;
	}
	public void setTempVolta(LocalTime tempVolta) {
		this.tempVolta = tempVolta;
	}
	public Float getVelocidadeMedia() {
		return velocidadeMedia;
	}
	public void setVelocidadeMedia(Float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	
}
