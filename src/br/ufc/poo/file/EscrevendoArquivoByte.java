package br.ufc.poo.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscrevendoArquivoByte {

	public static void main(String args[]) {
	
		File diretorio = new File("/home/luan/Aasegunda");
		
		if (!diretorio.isDirectory())
	     diretorio.mkdir();
		
		File arquivo = new File(diretorio, "ArquivoByte.txt");
		try {
			FileOutputStream gravador = new FileOutputStream(arquivo);
			byte[] conteudo = {'P', 'O', 'O'};
			gravador.write(conteudo);
			gravador.close();
	   } catch (IOException ioe) {
		   ioe.printStackTrace();
	   }
    }
}
