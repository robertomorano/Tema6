package ej1;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Agenda {
	private static final String RUTA = "src\\ej1\\Agenda.txt";

	public static void main(String[] args) {
		int key = 0;
		String nombre = "";
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> agenda = new HashMap<String, Integer>();
		try (Scanner reader = new Scanner(new FileReader(RUTA))){
			while(reader.hasNext()) {
				nombre = reader.next();
				numero = reader.nextInt();
				agenda.put(nombre, numero);
				System.out.println("contacto");
			}
		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero: " + e.getMessage());
		}
		do {
			System.out.println("Selecciona opcion");
			menu();
			key = sc.nextInt();
			switch (key) {
			case 1 -> {
				if (agenda.size() < 20) {
					System.out.println("NOmbre Contacto");
					nombre = sc.next();

					System.out.println("Numero");
					numero = sc.nextInt();
					if (!agenda.containsKey(nombre)) {
						agenda.put(nombre, numero);
						try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA, true))) {
							bw.newLine();
							bw.append(nombre + " " + numero);
							bw.flush();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
			case 2 -> {
				
				try (Scanner reader = new Scanner(new FileReader(RUTA))){
					while(reader.hasNext()) {
						nombre = reader.next();
						numero = reader.nextInt();
						System.out.println(nombre+": "+ numero);
					}
				} catch (IOException e) {
					System.out.println("Error al escribir en el fichero: " + e.getMessage());
				}	
			}
			case 3 -> {
				System.out.println("Nombre; ");
				nombre = sc.next();
				if(agenda.containsKey(nombre)){
					System.out.println(nombre+": "+ agenda.get(nombre));
				}else {
					System.out.println("no Existe");
				}
				
			}
			case 4 -> {
				break;
			}
			}
		} while (key != 4);
		sc.close();
	}

	static void menu() {
		System.out.println("Nuevo contacto.\r\n" + "Buscar por nombre.\r\n" + "Mostrar todos.\r\n" + "Salir.\r\n" + "");
	}

	static void lecturaBuscar() {
		try (Scanner reader = new Scanner(new FileReader(RUTA))) {

		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero: " + e.getMessage());
		}

	}
}
