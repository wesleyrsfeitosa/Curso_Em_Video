package aula04;

public class Aula04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta04 c1 = new Caneta04("BIC", 0.5f, "Azul");
		Caneta04 c2 = new Caneta04("GEL", 1.0f, " Vermelha");
		//c1.setModelo("BIC");
		//c1.setPonta(0.5f);
		c1.status();
		System.out.println("");
		c2.status();
		
		//System.out.println("Tenho uma caneta " + c1.getModelo() + " Ponta " + c1.getPonta());
	}

}
