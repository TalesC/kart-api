package br.com.kartapi.model;

import java.util.List;

public class Piloto {
	
	private String nome;
	private Integer codigo;
	
	private List<Voltas> voltas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public List<Voltas> getVoltas() {
		return voltas;
	}
	public void setVoltas(List<Voltas> voltas) {
		this.voltas = voltas;
	}
	@Override
	public String toString() {
		return "Piloto [nome=" + nome + ", numeroCarro=" + codigo + ", voltas=" + voltas + "]";
	}
	
}
