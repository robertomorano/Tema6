package ej1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ecribiDatos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto = "";
		int num = 0;
		try (FileWriter writer = new FileWriter("src\\ej1\\escribir.txt", true)){
			while(!texto.equals("fin")) {
				writer.write(texto);
				System.out.println("Nombre");
				texto = sc.nextLine();
				System.out.println("Edad");
				num = sc.nextInt();
				sc.nextLine();
			}
			sc.close();
		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero: " + e.getMessage());
		}
	}

}
