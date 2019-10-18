package br.com.kartapi;

import java.util.List;

import br.com.kartapi.model.DadosLog;
import br.com.kartapi.model.Piloto;
import br.com.kartapi.service.CorridaService;
import br.com.kartapi.service.DadosLogService;
import br.com.kartapi.service.PilotoService;
import br.com.kartapi.service.impl.CorridaServiceImpl;
import br.com.kartapi.service.impl.DadosLogServiceImpl;
import br.com.kartapi.service.impl.PilotoServiceImpl;

public class KartMain {
	
	public static void main(String[] args) {
		
		//busca todos os dados do arquivo de log
		DadosLogService dadosService = new DadosLogServiceImpl();
		List<DadosLog> dadosLog = dadosService.getDadosLog("./resource/kartlog.csv");
		//dadosLog.forEach(dados -> System.out.println(dados.toString()));
		
		//gera modelo com dados do piloto
		PilotoService pilotoService = new PilotoServiceImpl();
		List<Piloto> pilotos = pilotoService.getPilotos(dadosLog);
		pilotos.forEach(p -> System.out.println(p.toString()));
		System.out.println("\n\n\n-------------------------------------\n\n\n");
		//gera informações e imprime o resultado na tela
		CorridaService corridaService = new CorridaServiceImpl();
		corridaService.resultado(pilotos);
		
		
	}

}
