package m9;

import java.io.*;

public class VerDir6{
	public static void main(String[] args){
		File d= new File("NuevoDir");
		File f1= new File(d,"Fichero1.txt");
		File f2= new File (d,"Fichero2.txt");
		d.mkdir();
		try {
			if (f1.createNewFile())
				System.out.println("Fichero1 creado correctamente");
			else
				System.out.println("No se ha podido crear Fichero1");
			if (f2.createNewFile())
				System.out.println("Fichero2 creado correctamente");
			else
				System.out.println("No se ha podido crear Fichero2");
		} catch (IOException ioe) {ioe.printStackTrace();}
		//f1.renameTo(new File(d,"Fichero1Nuevo"));
		//No funciona el delete al hacer el renameTo

		try {
			File f3 = new File ("NuevoDir/Fichero3.txt");
			f3.createNewFile();
			try {
				f3.delete();
				System.out.println("Fichero 3 eliminado.");
			} catch (Exception e) {
				System.out.println("No se ha podido eliminar");
			}
		}catch (IOException ioe) {ioe.printStackTrace();}

		try {
			f1.delete();
			System.out.println("Fichero 1 eliminado.");
		} catch (Exception e) {
			System.out.println("No se ha podido eliminar");
		}

		try {
			f2.delete();
			System.out.println("Fichero 2 eliminado.");
		} catch (Exception e) {
			System.out.println("No se ha podido eliminar");
		}

		try {
			d.delete();
			System.out.println("Directorio eliminado.");
		} catch (Exception e) {
			System.out.println("No se ha podido eliminar");
		}

	}
}
