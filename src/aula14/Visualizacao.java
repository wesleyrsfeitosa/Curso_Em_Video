package aula14;

public class Visualizacao {
private Gafanhoto espectador;
private Video filme;

//construtor----------------------------------------------
public Visualizacao(Gafanhoto espectador, Video filme) {
	super();
	this.espectador = espectador;
	this.filme = filme;
	this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
	this.filme.setViews(this.filme.getViews()+1);
}



//polimorfismo sobrecarga-------------------------------------------

public void avaliar() {
	this.filme.setAvaliacao(5);
}

public void avaliar(int nota) {
	this.filme.setAvaliacao(nota);
}

public void avaliar(float porc) {
	int tot = 0;
	if(porc <=20) {
		tot = 3;
		}else if ( porc <50) {
			tot=5;
			}else if ( porc <=90) {
				tot = 8;
			}else {
				tot = 10;
			}
			this.filme.setAvaliacao(tot);	
}


//metodos especiais--------------------------------------------
public Gafanhoto getEspectador() {
	return espectador;
}

public void setEspectador(Gafanhoto espectador) {
	this.espectador = espectador;
}

public Video getFilme() {
	return filme;
}

public void setFilme(Video filme) {
	this.filme = filme;
}

@Override
public String toString() {
	return "\nVisualizacao: \nespectador =  " + espectador + " \nfilme = " + filme;
}






}
