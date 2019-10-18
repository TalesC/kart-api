package br.com.kartapi.service.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.kartapi.model.DadosLog;
import br.com.kartapi.model.Piloto;
import br.com.kartapi.service.PilotoService;

public class PilotoServiceImpl implements PilotoService {

	@Override
	public List<Piloto> getPilotos(List<DadosLog> dados) {
		List<Piloto> pilotos = new ArrayList<Piloto>();
		dados.stream().map(dado -> pilotos.add(createPiloto(dado)));
		return pilotos;
	}

	private Piloto createPiloto(DadosLog dado) {
		Piloto p = new Piloto();
		p.setNome(dado.getNomePiloto());
		p.setCodigo(dado.getCodigoPiloto());
		p.setVoltas();
		return null;
	}

}
