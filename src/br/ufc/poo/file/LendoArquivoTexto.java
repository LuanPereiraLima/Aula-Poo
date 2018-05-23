package br.ufc.poo.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LendoArquivoTexto {

	public static void main(String args[]) {
	    try {
	    	String pathDir = "/home/luan/Aaquarta";
	    
	    	String pathArquivo = pathDir + "/" + "ArquivoTexto.txt";	            
	    	
	    	FileReader arquivo = new FileReader(pathArquivo);
	    	
	    	BufferedReader leitor = new BufferedReader(arquivo);
	    	
	    	String contetudo = leitor.readLine();
	    	
	    	while (contetudo != null) {
	    		System.out.println(contetudo);
	    		contetudo = leitor.readLine();
	    	}
	    	
	    	leitor.close();
	     
	    } catch (IOException ioe) {
		   ioe.printStackTrace();
	    }
    }
}
