package aula08;

public class Livro implements Publicacao{

	//atributos-----------------------------------------------------------------------------------
		private String titulo;
		private String autor;
		private int totPaginas;
		private int pagAtual;
		private boolean aberto;
		private Pessoa leitor;
		
		// construtor--------------------------------------------------------------------------
		
		

		//metodos get e set
public String getTitulo() {
			return titulo;
		}


		public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
			super();
			this.titulo = titulo;
			this.autor = autor;
			this.totPaginas = totPaginas;
			this.pagAtual = 0;
			this.aberto = false;
			this.leitor = leitor;
		}


		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}


		public String getAutor() {
			return autor;
		}


		public void setAutor(String autor) {
			this.autor = autor;
		}


		public int getTotPaginas() {
			return totPaginas;
		}


		public void setTotPaginas(int totPaginas) {
			this.totPaginas = totPaginas;
		}


		public int getPagAtual() {
			return pagAtual;
		}


		public void setPagAtual(int pagAtual) {
			this.pagAtual = pagAtual;
		}


		public boolean getAberto() {
			return aberto;
		}


		public void setAberto(boolean aberto) {
			this.aberto = aberto;
		}


		public Pessoa getLeitor() {
			return leitor;
		}


		public void setLeitor(Pessoa leitor) {
			this.leitor = leitor;
		}


		//metodos---------------------------------------------------------------
		
		
			
			public String detalhes() {
			return "---------Livro---------- \n titulo = " + titulo + "\n autor = " + autor + 
					" \n totPaginas = " + totPaginas + "\n pagAtual = "
					+ pagAtual+ "\n aberto = " + aberto + "\n leitor = "
					+ leitor.getNome() + " Idade = "
							+ leitor.getIdade() + " Sexo = "
							+ leitor.getSexo();
			}

		
		
	
	
	//encapsulamento
	@Override		
	public void abrir() {
		this.setAberto(true);
		
	}

	@Override
	public void fechar() {
		this.setAberto(false);
		
	}

	
	public void folhear(int p) {
		if(p > this.totPaginas) {
		this.pagAtual = 0;	
		}else {
			this.pagAtual = p;
		}
		
		
	
	}
	
	
		@Override
	public void avancarPag() {
		this.pagAtual++;
		//this.setPagAtual(this.getPagAtual()+1);
		
	}

	@Override
	public void voltarPag() {
		this.pagAtual--;
		//this.setPagAtual(this.getPagAtual()-1);
		
	}


	
		
	}


	


