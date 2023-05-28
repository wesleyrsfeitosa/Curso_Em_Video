package aula12;

public class ProjetoPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamifero mam = new Mamifero();
		Reptil rep = new Reptil();
		Peixe pei = new Peixe();
		Ave ave = new Ave();
		Canguru can = new Canguru();
		Cachorro cac = new Cachorro();
		Cobra cob = new Cobra();
		Tartaruga tar = new Tartaruga();
		GoldFish gol = new GoldFish();
		Arara ara = new Arara();
		
		rep.locomover();
		pei.locomover();
		ave.locomover();
		can.locomover();
		cob.locomover();
		tar.locomover();
		gol.locomover();
		ara.locomover();
		
		mam.setPeso(35.3f);
		mam.setCorPelo("Marrom");
		mam.locomover();
		mam.alimentar();
		mam.emitirSom();
		
		can.locomover();
		can.urarBolsa();
		
		cac.locomover();
		cac.emitirSom();
		System.out.println("");
		
	
		
		
	}

}
