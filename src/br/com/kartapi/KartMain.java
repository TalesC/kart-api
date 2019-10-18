package br.com.kartapi;

import java.util.List;

import br.com.kartapi.model.DadosLog;
import br.com.kartapi.service.KartService;
import br.com.kartapi.service.impl.KartServiceImpl;

public class KartMain {
	
	public static void main(String[] args) {
		KartService service = new KartServiceImpl();
		List<DadosLog> dadosLog = service.getDadosLog("./resource/kartlog.csv");
		
		dadosLog.forEach(dados -> System.out.println(dados.toString()));
		
	}

}
