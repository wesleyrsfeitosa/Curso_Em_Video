package aula14;

public class Video implements AcoesVideo{
	
	
	//atributos---------------------------------------------
	private String titulo;
	private int Avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	//Construtor-----------------------------------------------------
	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.Avaliacao=1;
		this.views=0;
		this.curtidas=0;
		this.reproduzindo=false;
	}
	//metodos especiasi get e set---------------------------------
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvaliacao() {
		return Avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		int nova;
		nova = (this.Avaliacao+avaliacao)/this.views;
		this.Avaliacao = nova;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	public boolean getReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	//metodos abstratos--------------------------------------------------------------
	@Override
	public void play() {
		this.reproduzindo=true;
		
	}
	@Override
	public void pause() {
		this.reproduzindo=false;
		
	}
	@Override
	public void like() {
		this.curtidas++;
		
	}
	@Override
	public String toString() {
		return "titulo = " + titulo + ", Avaliacao = " + Avaliacao + 
				", views = " + views + ", curtidas = " + curtidas
				+ ", reproduzindo = " + reproduzindo;
	}
	
	
	

}
