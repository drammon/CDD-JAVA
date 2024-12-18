package fundamentos_3;

public class Animal {
	
	public Animal() {
		
	}
	
	private String nome;
	private String tutor;
	private char rg;
	private String raca;
	private String data;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getTutor() {
		return tutor;
	}
	
	public void setTutor(String tutor){
		this.tutor = tutor;
	}
	public char getRg() {
		return rg;
	}
	
	public void setRg(char rg){
		this.rg = rg;
	}
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca){
		this.raca = raca;
	}
	public String getData() {
		return data;
	}
	
	public void setData(String data){
		this.data = data;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	

}