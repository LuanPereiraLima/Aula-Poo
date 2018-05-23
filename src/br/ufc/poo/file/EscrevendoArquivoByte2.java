package br.ufc.poo.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class EscrevendoArquivoByte2 {
	public static void main(String args[]) {
		
	   File diretorio = new File("/home/luan/Aaterceira");
	   
	   if (!diretorio.isDirectory())
	     diretorio.mkdir();

	   File arquivo = new File(diretorio, "ArquivoByte.txt");
	     
	   try {
		   FileOutputStream gravador = new FileOutputStream(arquivo);
		  
		   OutputStreamWriter conversor = new OutputStreamWriter(gravador);
		   
		   BufferedWriter gravadorBuff = new BufferedWriter(conversor);
		   
		   char[] conteudo = {'P','O','O'};
		   
		   for (int i = 0; i < 5; i++) {
			   gravadorBuff.write(conteudo);
			   gravadorBuff.newLine();
		   }
		   
		   gravadorBuff.close();
		   gravador.close();
	   
	   } catch (IOException ioe) {
	      ioe.printStackTrace();
	   }
    }
}
