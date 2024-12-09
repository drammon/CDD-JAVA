package javapoo;
public class CalculadoraTeste {
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		int resp = calc.som(1, 2);
		System.out.println(resp);
	
		double resp2 = calc.sub(3,2.5);
		
		System.out.println(resp2);
	
		double resp3 = calc.div(5, 4);
		System.out.println(resp3);
	
		int resp4 = calc.mult(8, 2);
		System.out.println(resp4);
	}
}
