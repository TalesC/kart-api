package br.com.kartapi.model.builder;

import java.time.LocalTime;

import br.com.kartapi.model.DadosLog;

public class DadosLogBuilder {

	private DadosLog dados;
	
	public DadosLogBuilder() {
		dados = new DadosLog();
	}
	
	public DadosLogBuilder horaTerminoVolta(String hora) {
		dados.setHoraTerminoVolta(LocalTime.parse(hora));
		return this;
	}
	
	public DadosLogBuilder nomePiloto(String nomeCodigoPiloto) {
		String aux = nomeCodigoPiloto.substring(5, 12);
		dados.setNomePiloto(aux);
		return this;
	}
	
	public DadosLogBuilder codigoPiloto(String nomeCodigoPiloto) {
		String aux = nomeCodigoPiloto.substring(0, 3);
		dados.setCodigoPiloto(Integer.parseInt(aux));
		return this;
	}
	
	public DadosLogBuilder numeroVolta(String numero) {
		dados.setNumeroVolta(Integer.parseInt(numero));
		return this;
	}
	
	public DadosLogBuilder tempoVolta(String tempoVolta) {
		Integer min = Integer.parseInt(tempoVolta.substring(0,1));
		Integer seg = Integer.parseInt(tempoVolta.substring(3,4));
		Integer mili = Integer.parseInt(tempoVolta.substring(5,8));
		dados.setTempoVolta(LocalTime.of(0, min, seg, mili));
		return this;
	}
	
	public DadosLogBuilder velocidadeMediaVolta(String velocidade) {
		velocidade = velocidade.replaceAll("\"", "");
		dados.setVelocidadeMediaVolta(Double.valueOf(velocidade));
		return this;
	}
	
	public DadosLog build() {
		return dados;
	}
}
