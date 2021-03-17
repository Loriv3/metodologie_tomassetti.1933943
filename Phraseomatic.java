package progetto;
/**
 * 
 * Crea una classe che prende delle stringhe casuali da tre liste e
 *stampa la frase composta
 */
public class Phraseomatic {
	
	private String[] saluti = {"Ciao","Heilà","Buongiorno","Buonsalve", "Salute"};
	private String[] agettivi = {"buon", "intelligente","diligente","stacanovista","viandate"};
	private String[] finale = {"cacciatore", "Bilbo", "studente", "HAL"};
	
	public String genera() {return saluti[rand(saluti.length)]+" "+rand(agettivi.length)+" "+rand(finale.length);}

	private int rand(int max) {return (int)Math.random()*max;}
}
