package aula05;

public class Aula05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBanco05 pessoa1 = new ContaBanco05();
		pessoa1.setNumConta(1111);
		pessoa1.setDono("Wesley");
		pessoa1.abrirConta("CC");
		pessoa1.depositar(100);
		pessoa1.fecharConta();
		
		
		
		ContaBanco05 pessoa2 = new ContaBanco05();
		
		pessoa2.setNumConta(2222);
		pessoa2.setDono("Sofia");
		pessoa2.abrirConta("CP");
		pessoa2.depositar(500);
		pessoa2.sacar(100);
		pessoa2.fecharConta();
		
		
		
		
		pessoa1.estadoAtual();
		
		pessoa2.estadoAtual();
		
		
	}

}
