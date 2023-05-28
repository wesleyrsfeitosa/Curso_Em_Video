package aula09;

public class Aluno extends Pessoa {

	//atributos
	private int matricula;
	private String curso;
	
	
	
	//metodo especiais get e set
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//metodos
	public void cancelarMatricula() {
		System.out.println("Matricula será cancelada!");
		
	}

}
