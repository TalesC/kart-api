package br.com.kartapi.service.impl;

import java.util.Comparator;
import java.util.List;

import br.com.kartapi.model.Piloto;
import br.com.kartapi.service.CorridaService;

public class CorridaServiceImpl implements CorridaService {

	@Override
	public void resultado(List<Piloto> pilotos) {
		pilotos.sort((Piloto p1, Piloto p2) -> p1.getTempoTotal().compareTo(p2.getTempoTotal()));
		pilotos.forEach(p -> System.out.println(p.toString()));
			
	}
	
	private void printResultado(List<Piloto> pilotos) {
		
	}
	

}
