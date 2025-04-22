package ej1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Alumnos {
	public static void main(String[] args) {
		String ruta = "src\\ej1\\Alumnos.txt";
		double suma = 0;
		double sumaDouble = 0;
		double cont = 0;
		String nombre = "";
		try (Scanner reader = new Scanner(new FileReader(ruta))) {
			while (reader.hasNext()) {
				nombre = reader.next();
				suma += reader.nextInt();
				sumaDouble = reader.nextDouble();
				cont++;
			}
			System.out.println(""+nombre+" \nMdia "+suma/cont + " media " + sumaDouble / cont);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
