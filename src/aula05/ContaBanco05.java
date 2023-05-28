package aula05;

public class ContaBanco05 {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

//contrutor
	public ContaBanco05() {
		super();

		this.setSaldo(0);
		this.setStatus(false);

	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

//metodos
	
	public void estadoAtual() {
		System.out.println("------------------------------");
		System.out.println("Conta " + this.getNumConta());
		System.out.println("Tipo " + this.getTipo());
		System.out.println("Dono " + this.getDono());
		System.out.println("Saldo " + this.getSaldo());
		System.out.println("Status " + this.getStatus());
		
	}

	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if(this.getTipo()=="CC") {
		//if ( "CC" . equals ( tipo ))  {
			this.setSaldo(50);
		} else 
			if(this.getTipo() == "CP") {
			//if ("CP" .equals(tipo)) {
			this.setSaldo(150);
		}
		System.out.println("Conta Aberta com sucesso");
	}

	public void fecharConta() {
		if(this.saldo > 0) {
		System.out.println("Conta de " + this.getDono() + " não pode ser fechada porque ainda tem dinheiro");	
		}
		else
			if(this.saldo < 0 ) {
				System.out.println("Conta de " + this.getDono() + " não pode ser fechada por tem débito");
			}
			else {
				this.setStatus(false);
				System.out.println("Conta fechada com sucesso");
			}
	}

	public void depositar( float valor) {
		if (this.getStatus() ){
			this.setSaldo(this.getSaldo()+valor);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		}
		else {
			System.out.println("Impossivel depositar em uma conta fechada!");
		}
		

	}

	public void sacar(float valor) {
		if(this.getStatus()) {
			if(this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente para saque!");
			}
		} else {
			System.out.println("Impopssivel sacar de uma conta fechada");
		}

	}

	public void pagarMensal() {
		
		int valor = 0;
		if (this.getTipo() == "CC") {
		//if("CC" .equals(tipo)){
			valor = 12;
			}
		else
			if(this.getTipo() =="CP") {
			//if("CP" .equals(tipo)) {
				valor = 20;
			}
	if(this.getStatus()) {
	this.setSaldo(this.getSaldo()-valor);	
	System.out.println("Mensalidade paga com sucesso por " + this.getDono());
	}else {
		System.out.println("impossivel pagar uma conta fechada!");
	}
	
		

	}

}
