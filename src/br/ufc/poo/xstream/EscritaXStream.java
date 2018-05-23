package br.ufc.poo.xstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.thoughtworks.xstream.XStream;

public class EscritaXStream {
	
	public static void main(String[] args) {
		
		XStream xstream = new XStream();
		
		Pessoa pessoa = new Pessoa("Luan", "Lima", 23);
		
		try {
			
			File caminhoArquivo = new File("/home/luan/Aaquinto");

			if(!caminhoArquivo.exists())
				caminhoArquivo.mkdirs();
			
			File arquivo = new File(caminhoArquivo, "Pessoa.xml");
			
			FileOutputStream saidaArquivo = new FileOutputStream(arquivo);
			
			xstream.toXML(pessoa, saidaArquivo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
