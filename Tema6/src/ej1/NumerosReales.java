package ej1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class NumerosReales {
	public static void main(String[] args) {
		String ruta = "src\\ej1\\NumerosReales.txt";
		double suma = 0;
		double cont = 0;
		try (Scanner reader = new Scanner(new FileReader(ruta))){
			while(reader.hasNextDouble()) {
				suma += reader.nextDouble();
				cont++;
			}
			System.out.println(suma +" media "+suma/cont );
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
