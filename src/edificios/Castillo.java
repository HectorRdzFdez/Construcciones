package edificios;

public class Castillo extends Militar {
	
	public Castillo() {
		super(20, 10);
		crearConstrucciones();
	}
	
	@Override
	public void crearConstrucciones() {
		
		for (int i=0;i<casilla.length;i++) {
			for (int j=0;j<casilla[i].length;j++) {
				
				if (i==0 || i==2 || i==4 || i ==6) {
					casilla[i][j]='x';
				}
				else if (j==1 || j==3 || j==5 || j==7) {
					casilla[i][j]='x';
				}
				
			}
		}
		
	}
	
}
