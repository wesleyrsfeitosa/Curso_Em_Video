package aula11;

public class ProjetoPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mamifero m = new Mamifero();
Reptil r = new Reptil();
Peixe p = new Peixe();
Ave a = new Ave();
Canguru c = new Canguru();		

m.setPeso(5.70f);
m.setIdade(8);
m.setMembros(4);
m.locomover();
m.alimentar();
m.emitirSom();
System.out.println("");

c.setPeso(55.30f);
c.setIdade(3);
c.setMembros(4);
c.locomover();
c.alimentar();
c.emitirSom();
c.usarBolsa();

System.out.println("");
p.setPeso(0.35f);
p.setIdade(1);
p.setMembros(0);
p.locomover();
p.alimentar();
p.emitirSom();
p.SoltarBolhas();

System.out.println("");
a.setPeso(0.89f);
a.setIdade(2);
a.setMembros(2);
a.locomover();
a.alimentar();
a.emitirSom();
a.fazerNinho();

System.out.println("");
r.setPeso(2.5f);
r.setIdade(3);
r.setMembros(4);
r.locomover();
r.alimentar();
r.emitirSom();


		
	}

}
