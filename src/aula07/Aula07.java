package aula07;

public class Aula07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lutador07 l [] = new Lutador07 [6];

l[0] = new Lutador07("Menino bonito" , "França", 31 , 1.75f , 68.9f , 11 , 3 , 1);


l[1] = new Lutador07("PutsCript" , "Brasil" , 29 , 1.68f , 57.8f , 14 , 2 , 3 );


l[2] = new Lutador07("Snapshadow" , "EUA" ,	35 , 1.65f , 80.9f , 12 , 2 , 1);

l[3] = new Lutador07("Dead Code" , "Australia" , 28 , 1.93f , 81.6f , 13 , 0 , 2 );

l[4] = new Lutador07( "UFOCobol" , "Brasil" , 37 , 1.70f , 119.3f , 5 , 4 , 3 );

l[5] = new Lutador07("Nerdaart" , "EUA" , 30 , 1.81f , 105.7f , 12 , 2 , 4 );



Luta07 ufc01 = new Luta07();
ufc01.marcarLuta(l[4], l[5]);
ufc01.lutar();
	}

}
