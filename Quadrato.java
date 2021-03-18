package progetto;

public class Quadrato {
	private int lato;
	
	public Quadrato(int l) {this.lato = l;}
	
	public int getPerimetro() {return this.lato*4;}
	
	public static void main(String[] args) {
		Quadrato quadrato = new Quadrato(Integer.parseInt(args[0]));
		
		System.out.println(quadrato.getPerimetro());
	}
}
