package br.com.kartapi.service;

import java.util.List;

import br.com.kartapi.model.Piloto;

public interface KartService {
	
	public List<Piloto> getPilotos(String path);

}
