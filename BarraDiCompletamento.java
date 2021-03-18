package progetto;

public class BarraDiCompletamento {
	
	private double partenza;
	private double completamento;
	private String barra;
	
	public BarraDiCompletamento(double start) {
		this.barra = "";
		this.partenza = Math.round(start);
		for(int i = 0; i < this.partenza; i++)
			this.barra+="*";
	}
	
	public String toString() {return this.barra;}
	
	public void incrementa(double boost) {
		this.completamento += boost;
		this.completamento = Math.round(this.completamento);
		for(int i = (int)this.partenza; i < this.completamento; i++)
			this.barra+="*";
	}
	
	public static void main(String[] args) {
		BarraDiCompletamento barra = new BarraDiCompletamento(5);
		barra.incrementa(20);
		barra.incrementa(25);
		System.out.println(barra.toString());
	}
}
