package javapoo;

public class Carro {
	
	String modelo, cor;
	double preco;
	
	boolean estado = false;
	boolean movimento = false;
	
	public Carro() {
		
	}
	public Carro(String modelo) {
		this.modelo = modelo;
	}
	public Carro(String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}
	public Carro(String modelo, String cor, double preco) {
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
	}
	
	
	public void ligar() {
		if (estado == false){
			System.out.println("Carro ligou: VROOM VROOM, b!tches know they can't catch me! ");
			estado = true;
		}else {
				System.out.println("O carro já está ligado.");
			}
		}
	
	public void desligar() {
		if (estado == true){
			System.out.println("Carro desligou");
			 estado = false;
		}else {
			System.out.println("O carro já está desligado.");
			}	
	}
	public void acelerar() {
		if (movimento == false && estado == true){
				System.out.println("Carro acelerou: VROOM VROOM, b!tches know they can't catch me! ");
				 movimento = true;
			}else if (movimento!=false){
				System.out.println("O carro já está na velocidade maxima.");
			}else {
				System.out.println("O carro está desligado!");
			}
		}
	
	public void frear() {
		if (movimento == true){
				System.out.println("Carro freiou.");
				movimento = true;
			}else {
				System.out.println("O carro já está parado.");
			}
		}
		
		


}


