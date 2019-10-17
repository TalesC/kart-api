package br.com.kartapi.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileUtil {
	
	public static void readFile(String path) {
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
		
	}
}
