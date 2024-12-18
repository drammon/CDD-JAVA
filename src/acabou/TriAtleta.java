package acabou;

public class TriAtleta implements Atleta, Ciclista, Nadador, Corredor {
	public String name;
	public boolean pronto = false;
	
	public void aquecer() {
		if (pronto == false) {
			System.out.println(name + " está aquecendo.");
			pronto = true;
		}else {
			System.out.println(name + " já está aquecido(a).");
		}
		
	}
	public void pedalar() {
		if (pronto == true) {
			System.out.println(name + " está pedalando.");
		}else {
			System.out.println(name + " não está aquecido(a). Aqueça primeiro.");
		}
		
	}
	public void nadar() {
		if (pronto == true) {
			System.out.println(name + " está nadando.");
		}else {
			System.out.println(name + " não está aquecido(a). Aqueça primeiro.");
		}
	}
	public void correr() {
		if (pronto == true) {
			System.out.println(name + " está correndo.");
		}else {
			System.out.println(name + " não está aquecido(a). Aqueça primeiro.");
		}
	}
	
}
