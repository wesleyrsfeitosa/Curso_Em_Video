package aula14;

public class ProjetoYoutube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Video v[] = new Video[3];
		
		v[0] = new Video("Aula 1 de JAVA");
		v[1] = new Video("Aula 2 de HTML");
		v[2] = new Video("Aula 3 de PHP");
		
		Gafanhoto g[] = new Gafanhoto[2];
		
		g[0] = new Gafanhoto("Wesley", 33, "Masculino", "wesleyrsfeitosa");
		g[1] = new Gafanhoto("Sofia", 5, "Feminino", "sofiafeitosa");
		
		
		/*System.out.println("Videos\n------------------------");
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		
		System.out.println("\nGafanhotos\n------------------------");
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());
		
		*/
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0], v[2]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g[0], v[1]);
		vis[0].avaliar(35.0f);
		System.out.println(vis[1].toString());
	}

}
