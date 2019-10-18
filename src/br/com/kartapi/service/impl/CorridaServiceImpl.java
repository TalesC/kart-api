package br.com.kartapi.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.kartapi.model.Piloto;
import br.com.kartapi.service.CorridaService;

public class CorridaServiceImpl implements CorridaService {

	@Override
	public void resultado(List<Piloto> pilotos) {
		
		Collections.sort(pilotos, Comparator.comparingInt(Piloto::getTotalVoltas).reversed());
		Collections.sort(pilotos, Comparator.comparing(Piloto::getTempoTotal));
		
		pilotos.forEach(p -> {
			p.setPosicao(pilotos.indexOf(p) + 1);
			printResultado(p);
		});
			
	}
	
	private void printResultado(Piloto piloto) {
		System.out.println("\n\n Piloto ");
		System.out.println("\n Posição Chegada = " + piloto.getPosicao());
		System.out.println("\n Código Piloto = " + piloto.getCodigo());
		System.out.println("\n Nome Piloto = " + piloto.getNome());
		System.out.println("\n Qtde Voltas Completadas = " + piloto.getTotalVoltas());
		System.out.println("\n Tempo Total de Prova = " + piloto.getTempoTotal());
		
	}
	

}
