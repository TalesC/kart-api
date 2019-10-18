package br.com.kartapi.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import br.com.kartapi.model.DadosLog;
import br.com.kartapi.model.builder.DadosLogBuilder;
import br.com.kartapi.service.KartService;

public class KartServiceImpl implements KartService {
	
	
	@Override
	public List<DadosLog> getDadosLog(String path) {
		List<DadosLog> logs = new ArrayList<DadosLog>();
		try {
			File file = new File(path);
			FileReader reader = new FileReader(file);
			BufferedReader input = new BufferedReader(reader);
			String linha = input.readLine();
			while((linha = input.readLine()) != null) {
				String[] dados = linha.split(",");
				logs.add(generateDados(dados));
			}
			input.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return logs;
	}
	
	private DadosLog generateDados(String[] dados) {
		DadosLog log = new DadosLogBuilder()
				.horaTerminoVolta(dados[0])
				.nomePiloto(dados[1])
				.codigoPiloto(dados[1])
				.numeroVolta(dados[2])
				.tempoVolta(dados[3])
				.velocidadeMediaVolta(dados[4]+"."+dados[5])
				.build();
		return log;
	}
	

	
}
