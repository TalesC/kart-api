package br.com.kartapi.service;

import java.util.List;

import br.com.kartapi.model.DadosLog;
import br.com.kartapi.model.Piloto;

public interface PilotoService {
	
	public List<Piloto> getPilotos(List<DadosLog> dados);

}
