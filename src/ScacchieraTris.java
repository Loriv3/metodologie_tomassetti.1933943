
public class ScacchieraTris {
	private char[][] scacchiera = new char[3][3];
	
	public ScacchieraTris() {
		for(int i = 0; i<3; i++) {
			for(int j = 0; j < 3; j++) scacchiera[i][j] = ' ';
		}
		
	}
	
	public void visualizzaScacchiera() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				sb.append("[").append(scacchiera[i][j]).append("]").append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
	
	public void inserisciSimbolo(char c, int i, int j) {
		scacchiera[i][j] = c;
	}
	
	public boolean evitareBari(int i, int j) {
		if(this.scacchiera[i][j] == ' ') return false;
		else return true; 
	}
}
