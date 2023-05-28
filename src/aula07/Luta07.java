package aula07;

import java.util.Random;

public class Luta07 {

	private Lutador07 desafiado;
	private Lutador07 desafiante;
	private int rounds;
	private boolean aprovada;

	public void marcarLuta(Lutador07 l1, Lutador07 l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;

		}
	}

public void lutar() {
	if(this.aprovada) {
		System.out.println("### DESAFIADO ###");
		this.desafiado.apresentar();
		System.out.println("### DESAFIANTE ###");
		this.desafiante.apresentar();
		
		Random aleatorio = new Random();
		int vencedor = aleatorio.nextInt(3);
		switch(vencedor) {
		case 0:
			System.out.println("Empatou!");
			this.desafiado.empatarluta();
			this.desafiante.empatarluta();
			break;
		case 1:
	 System.out.println("Vitoria do " + getDesafiado().getNome());
	 this.desafiado.ganharluta();
	 this.desafiante.perderluta();
			
			break;
		case 2:	
			System.out.println("Vitoria do " + getDesafiante().getNome());
			this.desafiante.ganharluta();
			this.desafiado.perderluta();
			
			break;
		}
		
	}else {
		System.out.println("A luta não pode acontecer! ");
	}
}

//metodos especiais

	public Lutador07 getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador07 desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador07 getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador07 desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}