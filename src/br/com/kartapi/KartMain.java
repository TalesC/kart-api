package br.com.kartapi;

import br.com.kartapi.service.KartService;
import br.com.kartapi.service.impl.KartServiceImpl;

public class KartMain {
	
	public static void main(String[] args) {
		KartService service = new KartServiceImpl();
		service.getPilotos("./resource/kartlog.csv");
	}

}
