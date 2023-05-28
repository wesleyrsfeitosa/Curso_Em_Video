package aula14;

public class Gafanhoto extends Pessoa{

	//contrutor---------------------------------------------------
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido=0;
		// TODO Auto-generated constructor stub
	}

	//atributos----------------------------------------------------
	private String login;
	private int totAssistido;
	
	
	
	//metodos especiais get e set------------------------------------
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotAssistido() {
		return totAssistido;
	}
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	//metodos---------------------------------------------------------------
	public void viuMaisUm() {
		
	}
	@Override
	public String toString() {
		return super.toString() + " login = " + login + " totAssistido = " + totAssistido;
	}
	
	
	
	
}
