package progetto;

public class Contatore 
{
	
	private int value;//campo della classe ed è una memoria PRIVATA
	
	
	public Contatore()//costruttore, unico metodoscritto con maiuscola
	{
		value = 0;
	}
	
	public void incremento() { value++; }
	
	 
	public int getValue() { return value; }
	
	public void reset() { value = 0;}
	
}
