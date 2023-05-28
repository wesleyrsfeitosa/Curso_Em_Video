package aula14;

public abstract class Pessoa {
	
	//atributos---------------------------------------------------------------
	protected String nome;
	protected int idade;
	protected String sexo;
	protected float experiencia;
	
	
	//contrutor-------------------------------------------------------------------
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
	}
	//metodos especiais get e set--------------------------------------------
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public float getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(float experiencia) {
		this.experiencia = experiencia;
	}
	
	//metodos---------------------------------------------------------------------
	
	protected void ganharExp() {
		
	}
	@Override
	public String toString() {
		return " nome = " + nome + " idade = " + idade + 
				" sexo = " + sexo + " experiencia = " + experiencia;
	}
	
	
	

}
