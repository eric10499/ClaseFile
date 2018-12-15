/*
 * VerDir6.java
 * 
 * Copyright 2018 ERIC <ERIC@DESKTOP-5T1N085>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * ● Copia el ejemplo anterior y ejecútalo ● Realiza un programa que elimine el directorio creado en el punto anterior. Para ello habrás de eliminar todos los archivos que se encuentren dentro del directorio.
 * 
 * Fet per Eric Visier Sánchez
 * 
 */

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
