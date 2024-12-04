package fundamentos_3;
import java.util.*;

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Escreva uma frase: ");
		String frase = input.nextLine();
		StringTokenizer qt = new StringTokenizer(frase);
		
		System.out.println(qt.countTokens());
	}
}
