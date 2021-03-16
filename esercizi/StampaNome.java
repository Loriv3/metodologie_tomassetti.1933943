package progetto;

/**
 *Classe che prende in input un nome e lo stampa tra un riquadro di trattini
 */
public class StampaNome {
	
	public static void main(String[] args) {
		
		/**
		 * Creo una costante con il tratteggio e una variabile nella quale andrò ad inserire il nome
		 * 
		 */
		final String TRATTINI = "+------------+";
		String nome = args[0];
		
		System.out.println(TRATTINI);
		System.out.println(args[0]);
		System.out.println(TRATTINI);
	}
	

}
