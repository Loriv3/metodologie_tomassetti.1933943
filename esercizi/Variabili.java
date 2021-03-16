package progetto;
/**
 * Creare una classe che: 
 * in una variabile stringa s inizializza il primo valore in input
 * in una variabile intera i salva il valore intero della stringa
 * in una variabile double d salva il valore della metà della variabile i
 * stampa le tre varibili
 */
public class Variabili {
	
	public static void main(String[] args) {
		
		String s = args[0];
		int i = Integer.parseInt(s);
		double d = i/2.0;
		
		System.out.println(s);
		System.out.println(i);
		System.out.println(d);
	}
}
