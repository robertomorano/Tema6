package ej1;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdenarNumeros {

	private static final String Ruta = "src\\ej1\\Enteros.txt";
	private static final String RutaEscr = "src\\ej1\\Enteros.txt";
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		System.out.println("numerosnuevo");
		try (Scanner reader = new Scanner(new FileReader(Ruta))){
			while(reader.hasNextInt()) {
				numeros.add(reader.nextInt());
				System.out.println("numerosnuevo");
			}
		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero: " + e.getMessage());
		}
		escribir(numeros);

	}
	static void escribir(ArrayList<Integer> numeros) {
		
		numeros.sort((a,b)->{return a-b;});
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(RutaEscr, true))){
				
				for(Integer num : numeros) {
					bw.write(String.valueOf(num));
				
					bw.flush();
					bw.newLine();
				}
		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero: " + e.getMessage());
		}
	}

}
