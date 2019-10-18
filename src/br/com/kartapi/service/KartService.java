package br.com.kartapi.service;

import java.util.List;

import br.com.kartapi.model.DadosLog;

public interface KartService {
	
	public List<DadosLog> getDadosLog(String path);

}
