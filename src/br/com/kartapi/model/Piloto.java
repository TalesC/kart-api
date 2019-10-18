package br.com.kartapi.model;

import java.util.List;

public class Piloto {
	
	private String nome;
	private String numeroCarro;
	
	private List<Voltas> voltas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroCarro() {
		return numeroCarro;
	}
	public void setNumeroCarro(String numeroCarro) {
		this.numeroCarro = numeroCarro;
	}
	public List<Voltas> getVoltas() {
		return voltas;
	}
	public void setVoltas(List<Voltas> voltas) {
		this.voltas = voltas;
	}
	@Override
	public String toString() {
		return "Piloto [nome=" + nome + ", numeroCarro=" + numeroCarro + ", voltas=" + voltas + "]";
	}
	
}
