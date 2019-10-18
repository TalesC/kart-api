package br.com.kartapi.model;

import java.time.LocalTime;
import java.util.List;

public class Piloto {
	
	private String nome;
	private Integer codigo;
	private Integer posicao;
	
	private List<Voltas> voltas;

	public Piloto() {
	}
	
	public Piloto(String nome, Integer codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public LocalTime getTempoTotal() {
		
	}
	
	public int getTotalVoltas() {
		return voltas.size();
	}
	
	//gets & sets
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
	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	@Override
	public String toString() {
		return "Piloto [nome=" + nome + ", numeroCarro=" + codigo + ", voltas=" + voltas.toString() + 
				", tempoTotal=" + getTempoTotal() +
				", voltasTotal=" + getTotalVoltas() +"]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piloto other = (Piloto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
		
}
