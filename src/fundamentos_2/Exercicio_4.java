package fundamentos_2;

public class Exercicio_4 {
	public static void main(String[] args) {
		int soma_3 = 0;
		int soma_5 = 0;
		int soma_total = 0;
		
		for (int i = 1; i < 20+1; i++) {
			if (i % 3 == 0) {
				soma_3 += i;
			}
			if (i % 5 == 0) {
				soma_5 += i;
			}
		}
		soma_total = soma_3 + soma_5;
		
		System.out.printf("A soma dos múltiplos de 3 é %d \n", soma_3);
		System.out.printf("A soma dos múltiplos de 5 é %d \n", soma_5);
		System.out.printf("A soma da soma dos múltiplos de 3 e 5 é %d", soma_total);


	}
}
