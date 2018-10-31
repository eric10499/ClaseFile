package m9;

import java.io.*;

public class VerDir3 {



	public static void main (String[] args) {
		String dir = args[0]; // directorio actual
		File f = new File(dir);
		File[] archivos = f.listFiles();
		System.out.printf("Ficheros en el directorio actual: %d %n", archivos.length);
		for (int x=0;x<archivos.length;x++){
			System.out.println(archivos[x].getName());
		}
	}
}


