package edificios;

public class Piramide extends Militar {
	
	public Piramide() {
		super(15 , 8);
		crearConstrucciones();
	}

	@Override
	public void crearConstrucciones() {
		
		for (int i=0;i<casilla.length;i++) {
			for (int j=0;j<casilla[i].length;j++) {
				if (i==3 || i==4) {
					casilla[i][j]='x';
				}
				if ((i==2 || i==5) && j==1) {
					casilla[i][j]='x';
				}
				if ((i==1 || i==6) && j==2) {
					casilla[i][j]='x';
				}
				if ((i==0 || i==7) && j==3) {
					casilla[i][j]='x';
				}
			}
		}
		
	}
	
	
	
}
