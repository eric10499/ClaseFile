/*
 * VerDir3.java
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
 * Aquest programa realiza la conversió de les dades de l'arxiu tsv a un fitxer sql.
 * 
 * Fet per Eric Visier Sánchez
 * 
 */

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


