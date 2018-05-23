package br.ufc.poo.xstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;

public class LeituraXStream {
	
	public static void main(String[] args) {
		
		XStream xstream = new XStream();
		
		try {
			
			File caminhoArquivo = new File("/home/luan/Aaquinto");

			if(!caminhoArquivo.exists())
				caminhoArquivo.mkdirs();
			
			File arquivo = new File(caminhoArquivo, "Pessoa.xml");
			
			FileInputStream saidaArquivo = new FileInputStream(arquivo);
			
			Pessoa pessoa = (Pessoa) xstream.fromXML(saidaArquivo);

			System.out.println(pessoa);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
