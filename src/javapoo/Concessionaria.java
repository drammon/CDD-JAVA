package javapoo;

public class Concessionaria {
	
	public static void main(String[] args) {
		
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
		
		Carro carro = new Carro();
		
		carro1 = carro.Carro('Honda');
		
	}
	
}
