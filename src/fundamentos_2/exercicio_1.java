package fundamentos_2;
import java.util.Scanner;
public class exercicio_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cont = 0, q = 0;
		double soma_das_notas = 0, media = 0, nota = 0;

		
		System.out.println("Digite quantos alunos tem a sua sala: ");
		q = sc.nextInt();
		
		while (cont < q) {
			
			System.out.printf("Digite a nota do %d º aluno: ", cont +1);
			nota = sc.nextDouble();
			soma_das_notas = soma_das_notas + nota;
			cont = cont + 1;
			
		}
		
		media =  soma_das_notas / q;
		System.out.printf("A média da turma é: %.2f", media);
	
	}
}
