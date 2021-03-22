import java.util.Scanner;

public class Tris {
	private int stato;
	
	public  Tris() {stato = 0;}
	
	public void cambiaGiocatore() {switch(stato) {
	case 0 -> stato = 1;
	case 1 -> stato = 0;
	}}
	
	public char getGiocatore() {
	char val = ' ';
	switch(stato){
	case 0 -> val = 'X';
	case 1 -> val = 'O';
	}
	return val;
	}
	
	
	public static void main(String[] args) {
		ScacchieraTris scacc = new ScacchieraTris();
		Scanner scanner = new Scanner(System.in);
		Tris s = new Tris();
		int i = 0;
		int j = 0;
		while(true) {
			scacc.visualizzaScacchiera();
			do {
				System.out.println("Inserire un valore intero tra 0 e 2 per le righe e per le colonne");
				i = scanner.nextInt();
				j = scanner.nextInt();
			}
			while(i >= 3 | j >= 3 || scacc.evitareBari(i, j));
			
			
			scacc.inserisciSimbolo(s.getGiocatore(), i, j);
			s.cambiaGiocatore();
		}
	}
}
