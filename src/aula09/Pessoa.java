package aula09;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String sexo;
	
	//metodo construtor
		
	
	
	//metodos especiais get e set
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
	
	
	//metodos
	
		@Override
	public String toString() {
		return "Pessoa [nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + "]";
	}


		public void fazerAniversario() {
			this.idade++;
			//this.setIdade(this.getIdade()+1);
		}
	
	
	
	
	
	
	
	

}
