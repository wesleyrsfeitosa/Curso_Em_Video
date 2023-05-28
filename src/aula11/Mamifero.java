package aula11;

public class Mamifero extends Animal {

	private String corPelo;

	//metodos especiais get e set
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	@Override
	public void locomover() {
		System.out.println("Correndo!");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Som de Mamifero");
	}
	
	
	
	
}
