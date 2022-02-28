package edificios;

public class Edificio extends Civiles {
	
	
	public Edificio() {
		super();
		crearConstrucciones();
	}
	
	
	@Override
	public void crearConstrucciones() {
		
		for (int i=0;i<casilla.length;i++) {
			for (int j=0;j<casilla[i].length;j++) {
				if (i==2 || i==3 || i==4 || i==5) {
					casilla[i][j]='x';
				}
			}
		}
	}
	
}
