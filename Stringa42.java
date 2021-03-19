package progetto;

public class Stringa42 {
	private String stringa;
	
	public Stringa42(String s1, String s2, String s3) {
		stringa = s1+" "+s2+" "+s3;
	}
	
	public String get42() {return stringa.substring(0,42);}
	public char getIni() {return stringa.charAt(0);}
	public boolean ha42() {return stringa.contains("42");}
	public boolean is42() {return stringa.equals("42");}
	
	
}
