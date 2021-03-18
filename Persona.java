package progetto;

public class Persona {
	private String nome;
	private String cognome;
	
	public Persona(String n, String s) {
		this.nome = n;
		this.cognome = s;
	}
	
	public String nomeCognome() {return this.nome+" "+this.cognome;}
	
	public static void main(String[] args) {
		Persona persona = new Persona(args[0], args[1]);
		persona.nomeCognome();
	}
}
