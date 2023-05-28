package aula01;

public class Carro01 implements Controlador01 {

	private String Marca;
	private String modelo;
	private String cor;
	private int ano;
	private boolean ligado;

	
	
public Carro01() {
		super();
		this.ligado = false;
	}

//get e set
	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	
	//metodos
	public void ligar() {
this.setLigado(true);
	}

	public void desligar() {
		this.setLigado(false);

	}

	public void andar() {
		if(this.getLigado()) {
			System.out.println("Estou andando...");
			}else {
				System.out.println("Impossivel andar com o carro desligado...");
			}

	}

	public void parar() {
		if(this.getLigado()) {
			System.out.println("Estou parado...");
		}else {
			System.out.println("O carro ja esta parado.....");
		}
		
	}
	
	public void status() {
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Ano: " + this.getAno());
		System.out.println("O carro esta ligado? " + this.getLigado());
	}

}

