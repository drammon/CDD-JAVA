package fundamentos_3;
import JColors;
public class Zoo {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.setNome("Passavante");
		String nome = animal.getNome();
		
		System.out.println("Nome do animal: " + nome);
		animal.getNome();
		
		animal.setData("14/06/1999");
		String  data = animal.getData();
		String ANSI_RESET = "\u001B[0m";
		System.out.println("A data de aniversário é: " + data + ANSI_RESET);
		System.out.println(ANSI_COLORNAME + "This text is colored" + ANSI_RESET);


	}
}
