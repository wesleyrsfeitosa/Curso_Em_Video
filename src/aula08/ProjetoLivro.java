package aula08;

public class ProjetoLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pessoa[] p = new Pessoa[2];
Livro[] l = new Livro[3];


p[0] = new Pessoa ("Sofia", 04, "F");
p[1] = new Pessoa( "Paolla", 33, "M");

l[0] = new Livro("Paraiso1", "Wesley1", 100, p[0]);
l[1] = new Livro("Paraiso2", "Wesley2", 200, p[0]);
l[2] = new Livro("Paraiso3", "Wesley3", 300, p[1]);


l[1].abrir();
l[1].folhear(250);
System.out.println(l[1].detalhes());
	}

}
