package aula07;

public class Lutador07 {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//---------------------------------------------

	public Lutador07(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	//-------------------------------------------------------
	//metodos get e set
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getNacionalidade() {
		return nacionalidade;
	}



	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public float getAltura() {
		return altura;
	}



	public void setAltura(float altura) {
		this.altura = altura;
	}



	public float getPeso() {
		return peso;
	}



	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria() {
		
		if ( peso < 52.2 ) {
			this.categoria = "Inválido" ;
		} else  if ( peso <= 70.3 ) {
			this.categoria = "Leve" ;
		} else  if ( peso <= 83.9 ) {
			this.categoria = "médio" ;
		} else  if ( peso <= 120.2 ) {
			this.categoria = "pesado" ;
		} else {
			this.categoria = "inválida" ;
	}
	}



	public int getVitorias() {
		return vitorias;
	}



	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}



	public int getDerrotas() {
		return derrotas;
	}



	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}



	public int getEmpates() {
		return empates;
	}



	public void setEmpates(int empates) {
		this.empates = empates;
	}


//-----------------------------------------------------
	
	//metodos
	public void apresentar() {
		System.out.println( "----------------------------------------" ) ;
		System.out.println( "CHEGOU A HORA! Apresentamos o Lutador: " + this . getNome ());
		System.out.println( "Diretamente de " + this . getNacionalidade ());
		System.out.println( "Idade: " + this . getIdade () + "anos" );
		System.out.println( "Altura: " + this . getAltura () + "m de altura" );
		System.out.println( "Pesando: " + this . getPeso () + "kg" );
		System.out.println( "Ganhou: " + this . getVitorias () + " Vezes" );
		System.out.println( "Perdeu: " + this . getDerrotas () + " Vezes" );
		System.out.println( "Empatou: " + this . getEmpates () + " Vezes" );
	}
	
	public void status() {
		System.out.println( this . getNome ());
		System.out.println( "é um peso " + this . getCategoria ());
		System.out.println( this . getVitorias () + "Vitorias" );
		System.out.println( this . getDerrotas () + " Derrotas" );
		System.out.println( this . getEmpates () + " Empates" );
	}
	
	public void ganharluta() {
		this.setVitorias(this.getVitorias() + 1);
		
	}
	
	public void perderluta() {
		this.setDerrotas(this.getDerrotas() - 1);
		
	}
	
	public void empatarluta() {
		this.setEmpates(this.getEmpates() + 1);
		
	}
		

}
