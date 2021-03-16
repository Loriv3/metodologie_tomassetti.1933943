package progetto;

/**
 * Classe che prende in input 2 valori e ne restituisce il prodotto
 */
public class Moltiplica {
	
	public static void main(String[] args){
		
		/**
		 * Creo due variabili in cui inserisco il primo e il secondo valore
		 * infine stampo in output il loro prodotto
		 */
		int primoValore = Integer.parseInt(args[0]);
		int secondoValore = Integer.parseInt(args[1]);
		
		System.out.println(primoValore * secondoValore);
	}
}
