package ej1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirCadenas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto = "";
		try (BufferedWriter out = new BufferedWriter(new FileWriter("src\\ej1\\escribir.txt"))){
			System.out.println("dadaf");
			while(!texto.equals("fin")) {
				out.write(texto);
				out.newLine();
				texto = sc.nextLine();
			}
			sc.close();
		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero: " + e.getMessage());
		}


	}

}
