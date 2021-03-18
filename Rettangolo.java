package progetto;

public class Rettangolo {
	private int [] x = new int[4];
	private int [] y = new int[4];
	private int xstart;
	private int ystart;
 	private int lunghezza;
	private int altezza;
	private Colore colore;
	
	
	  
	private void creaRettangolo(int x, int y, int h, int l){
		this.x[0] = x;
		this.y[0] = y;
		this.x[1] = x;
		this.y[1] = y + h;
		this.x[2] = x + l;
		this.y[2] = y;
		this.x[3] = x + l;
		this.y[3] = y + h;
	}
	public Rettangolo(int x, int y, int h, int l) {
		this.xstart = x;
		this.ystart = y;
		this.altezza = h;
		this.lunghezza = l;
		this.colore = Colore.NERO;
	}
	
	public void trasla(int x, int y) {
		this.xstart = x;
		this.ystart = y;
	}
	
	public String toString() {
		this.creaRettangolo(this.xstart, this.ystart, lunghezza, altezza);
		int massimoX = 0;
		int massimoY = 0;
		int minimoX = 0;
		int minimoY = 0;
		
		if(this.altezza>0 && this.lunghezza >0) {
			 massimoY = y[1];
			 massimoX = x[1]; 
			 minimoY = y[2];
			 minimoX = x[2]; 
		}
		if(this.altezza>0 && this.lunghezza >0) {
			 massimoY = y[1];
			 massimoX = x[1]; 
			 minimoY = y[2];
			 minimoX = x[2]; 
		}
		if(this.altezza < 0 && this.lunghezza >0) {
			 massimoY = y[0];
			 massimoX = x[0]; 
			 minimoY = y[2];
			 minimoX = x[2]; 
		}
		if(this.altezza>0 && this.lunghezza <0) {
			 massimoY = y[3];
			 massimoX = x[3]; 
			 minimoY = y[0];
			 minimoX = x[0]; 
		}
		if(this.altezza <0 && this.lunghezza <0) {
			 massimoY = y[3];
			 massimoX = x[3]; 
			 minimoY = y[1];
			 minimoX = x[1]; 
		}
		
		
		return "("+ Integer.toString(massimoX)+", "+ Integer.toString(massimoY)+")"+"-> ("+ Integer.toString(minimoX)+", "+ Integer.toString(minimoY)+")"; 
	}
	
	private void setColore(int r, int g, int b) {this.colore = new Colore(r, g, b);}
}
