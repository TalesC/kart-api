package br.com.kartapi.service.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.com.kartapi.model.Piloto;
import br.com.kartapi.service.CorridaService;

public class CorridaServiceImpl implements CorridaService {

	@Override
	public void resultado(List<Piloto> pilotos) {
		int index = 0;
		for(int i = 4; i >= 0 ; i--) {
			List<Piloto> pilotCompletVoltas = filterPilotosByVoltas(pilotos, i);
			ordenarListaTempoVoltas(pilotCompletVoltas);
			
			for(Piloto piloto: pilotCompletVoltas) {
				index++;
				piloto.setPosicao(index);
				printResultado(piloto);
			}
		}
			
	}
	
	private List<Piloto> filterPilotosByVoltas(List<Piloto> pilotos, int voltas){
		return pilotos.stream().filter(p -> p.getTotalVoltas() == voltas).collect(Collectors.toList());
	}
	
	private void ordenarListaTempoVoltas(List<Piloto> pilotos) {
		Collections.sort(pilotos, Comparator.comparing(Piloto::getTempoTotal));
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
