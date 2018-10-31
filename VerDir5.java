package m9;

import java.io.File;

public class VerDir5 {


	public static void main (String[] args) {
		String dir = "/home/cf17eric.visier/Baixades"; // directorio actual
		File f = new File(dir, "Proyecto_Final_201819.pdf");

		System.out.printf("Nombre: " + f.getName() + " , Ruta Relativa: " + f.getPath() + " , Ruta Absoluta: " + f.getAbsolutePath());
		System.out.printf("Permisos: Lectura: " + f.canRead()+ " Escritura:" + f.canWrite() + " Executar:" + f.canExecute() + " , Tamaño: " + f.length());
	}
}
