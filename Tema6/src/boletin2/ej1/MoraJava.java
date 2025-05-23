package boletin2.ej1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MoraJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ruta = "src\\boletin2\\ej1\\carta.txt";
		double cont = 0;
		String texto = "";
		try (Scanner reader = new Scanner(new FileReader(ruta))) {
			do {
			while (reader.hasNext() && cont < 24) {
				System.out.println(reader.nextLine());
				cont++;
			}
			System.out.println("Continuar?");
			texto = sc.next();
			}while(texto.equals("more"));
			sc.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
