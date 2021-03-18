package progetto;

public class Colore {
	private int r;
	private int g;
	private int b;
	static final Colore NERO = new Colore(0,0,0);
	
	public Colore(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
}
