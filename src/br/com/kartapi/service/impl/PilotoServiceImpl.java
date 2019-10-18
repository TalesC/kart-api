package br.com.kartapi.service.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.kartapi.model.DadosLog;
import br.com.kartapi.model.Piloto;
import br.com.kartapi.model.Voltas;
import br.com.kartapi.service.PilotoService;

public class PilotoServiceImpl implements PilotoService {

	@Override
	public List<Piloto> getPilotos(List<DadosLog> dados) {
		List<Piloto> pilotos = new ArrayList<Piloto>();
		dados.forEach(dado -> {
				Piloto pil = findPiloto(dado, pilotos);
				if(pil == null) pilotos.add(createPiloto(dado)); 
			});
		return pilotos;
	}
	
	private Piloto findPiloto(DadosLog dado, List<Piloto> pilotos) {
		return pilotos.stream()
					.filter(piloto -> piloto.equals(new Piloto(dado.getNomePiloto(), dado.getCodigoPiloto())))
					.map(piloto -> updatePiloto(piloto, dado))
					.findAny()
					.orElse(null);
	}

	private Piloto updatePiloto(Piloto piloto, DadosLog dado) {
		piloto.getVoltas().add(new Voltas(dado.getHoraTerminoVolta(),
												dado.getTempoVolta(),
												dado.getVelocidadeMediaVolta()));
		return piloto;
	}

	private Piloto createPiloto(DadosLog dado) {
		Piloto p = new Piloto();
		p.setNome(dado.getNomePiloto());
		p.setCodigo(dado.getCodigoPiloto());
		p.setVoltas(new ArrayList<Voltas>());
		return p;
	}

}
