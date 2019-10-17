package br.com.kartapi.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

import br.com.kartapi.model.Piloto;
import br.com.kartapi.service.KartService;

public class KartServiceImpl implements KartService {
	
	
	@Override
	public List<Piloto> getPilotos(String path) {
		try {
			File file = new File(path);
			FileReader reader = new FileReader(file);
			BufferedReader input = new BufferedReader(reader);
			String linha;
			while((linha = input.readLine()) != null) {
				System.out.println(linha);
			}
			input.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	

	
}
