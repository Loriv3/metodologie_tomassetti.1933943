package progetto;

public class Cerchio {
	
	private double raggio;
	
	public Cerchio(double r) {this.raggio = r;}
	
	public double getCirconferenza() {return this.raggio*2*Math.PI;}
	public double getArea() {return Math.pow(this.raggio, 2)*Math.PI;}
	
	public static void main(String[] args) {
		Cerchio cerchio = new Cerchio(1);
		Cerchio cerchio1 = new Cerchio(5);
		
		System.out.println(cerchio.getCirconferenza());
		System.out.println(cerchio1.getArea());
	}
}
