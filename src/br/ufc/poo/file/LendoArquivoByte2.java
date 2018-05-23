package br.ufc.poo.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LendoArquivoByte2 {
	
	public static void main(String args[]) {
	
		File diretorio = new File("/home/luan/Aaterceira");
	    
		if (!diretorio.isDirectory())	
			diretorio.mkdir();
	    
	     File arquivo = new File(diretorio, "ArquivoByte.txt");

	     if (arquivo.isFile() && arquivo.canRead()) {
	     
	    	 try {
	    		 FileInputStream leitor = new FileInputStream(arquivo);
	    		 
	    		 InputStreamReader conversor = new InputStreamReader(leitor);
	    		 
	    		 BufferedReader leitorBuff = new BufferedReader(conversor);
	    		 
	    		 String conteudo = leitorBuff.readLine();
	    		 
	    		 while (conteudo != null) {
	    			 System.out.println(conteudo); 
	    			 conteudo = leitorBuff.readLine();
	    		 }
	    		 
	    		 leitorBuff.close(); leitor.close();
	       
	    	} catch (IOException ioe) {
		     ioe.printStackTrace();
	    	}
	     }
    }
}
