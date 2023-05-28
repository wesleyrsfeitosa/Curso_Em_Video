package aula09;

public class ProjetoPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		
		
		
		
		p1.setNome("Wesley");
		p1.setIdade(33);
		p1.setSexo("Masculino");
		
		p2.setNome("Maria");
		p2.setIdade(58);
		p2.setSexo("Feminino");
		p2.setCurso("Informática");
		
		p3.setNome("Sofia");
		p3.setIdade(5);
		p3.setSexo("Feminino");
		p3.setSalario(2500.75f);
		
		p4.setNome("Ramos");
		p4.setIdade(58);
		p4.setSexo("Masculino");
		p4.setSetor("Estoque");
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		/*linhas de codigos erradas
		p1.receberAumento(550.20f);
		p2.mudarTrabalho();
		p4.cancelarMatricula();
		*/
	}

}
