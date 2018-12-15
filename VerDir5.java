/*
 * VerDir5.java
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
 * Realiza un programa Java que muestre la siguiente información de un fichero cualquiera: Nombre, ruta relativa, ruta absoluta, permisos y tamaño.
 * 
 * Fet per Eric Visier Sánchez
 * 
 */

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
