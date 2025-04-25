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
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ej1\\escribirPersonas.txt", true))){
			System.out.println("Nombre");
			texto = sc.nextLine();
			while(!texto.equals("fin")) {
				
				System.out.println("Edad");
				num = sc.nextInt();
				sc.nextLine();
				
				bw.write(texto + " "+ num);
				
				bw.flush();
				bw.newLine();
				System.out.println("Nombre");
				texto = sc.nextLine();
			}
			sc.close();
		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero: " + e.getMessage());
		}
	}

}
