package javapoo;

public class Byd extends Carro {
	public String motor;
	public Byd() {
		
	}
	public Byd(String motor, String modelo, String cor) {
		
	}
	public static void main(String[] args) {
		Byd byd = new Byd();
		
		byd.acelerar();
		byd.desligar();
		byd.ligar();
		byd.ligar();
	}
}
