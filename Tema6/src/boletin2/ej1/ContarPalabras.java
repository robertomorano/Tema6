package boletin2.ej1;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ContarPalabras {
	final static String RUTA = "src\\boletin2\\ej1\\carta.txt";

	public static void main(String[] args) {
		int contLineas = 0;
		int contPalabras = 0;
		int contLetras = 0;
		String[] palabras;
		String[] letras;
		String linea = "";
		try (Scanner reader = new Scanner(new FileReader(RUTA))) {
			while (reader.hasNext()) {
				linea = reader.nextLine();
				palabras = contarPalabras(linea);
				contPalabras += palabras.length;
				for (String palabra : palabras) {
					letras = contarLetra(palabra);
					contLetras += letras.length;
				}
				contLineas++;
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static String[] contarPalabras(String linea) {
		String[] palabras;
		palabras = linea.split(" ");
		return palabras;
	}

	private static String[] contarLetra(String palabra) {
		String[] letras;
		letras = palabra.split("");
		return letras;
	}
}
