package fundamentos_2;

import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String[] args) {
		int array1[] = new int[4];
		int array2[] = new int[4];
		int array3[] = new int[4];
		int array4[] = new int[4];
		Scanner input = new Scanner(System.in);
		
		
		for (int i = 0; i < 4; i++) {
			System.out.printf("Digite o %d valor do array: ", i);
			array1[i] = input.nextInt();
		}
		System.out.println(array1[]);
	}

}
