package aula10;

public class Aula10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Visitante v1 = new Visitante(); v1.setNome("Wesley"); v1.setIdade(22);
		 * v1.setSexo("M"); System.out.println(v1.toString());
		 */
		Aluno a1 = new Aluno();
		a1.setNome("Sofia");
		a1.setMatricula(1111);
		a1.setCurso("Balé");
		a1.setIdade(5);
		a1.setSexo("F");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1112);
		b1.setNome("Wesley");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();

		// Pessoa p1 = new Pessoa();
	}

}
