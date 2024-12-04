package fundamentos_3;

import java.util.Scanner;

public class Exercicio04 {
	 public static void main(String[] args) {
		 Scanner input = new Scanner (System.in);
		 System.out.println("Insira um texto: ");
		 
		 String texto = input.nextLine();
		 texto = texto.toUpperCase();
		 System.out.println(texto);
		 
	}
}
