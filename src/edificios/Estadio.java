package edificios;

public class Estadio extends Civiles {
	
	
	public Estadio() {
		super();
		crearConstrucciones();
	}
	
	
	@Override
	public void crearConstrucciones() {
		
		for (int i=0;i<casilla.length;i++) {
			for (int j=0;j<casilla[i].length;j++) {
				if (j==2 || j==3) {
					casilla[i][j]='x';
				}
			}
		}
		
	}
	
	
	
}
