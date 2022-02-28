package edificios;

import java.util.Scanner;

public abstract class Construccion implements CreadorEnergia {
	
	protected char [][] casilla;
	protected int numPlanta;
	protected int aforo;
	protected Scanner teclado=new Scanner(System.in);
	protected int energia;
	
	public Construccion() {
		System.out.println("Cuantas personas como maximo puede haber en esta construccion ");
		aforo=Integer.parseInt(teclado.nextLine());
		casilla=new char [8][4];
	}
	
	public abstract void crearConstrucciones();
	
	public int getNumeroPlantas() {
		for (int i=0;i<casilla.length;i++) {
			for (int j=0;j<casilla[i].length;j++) {
				if (casilla[i][j]=='x') {
					numPlanta++;
					break;
				}
			}
		}
		return numPlanta;
	}
	
	public int generarEnergia() {
		for (int i=0;i<casilla.length;i++) {
			for (int j=0;j<casilla[i].length;j++) {
				if (casilla[i][j]=='x') {
					energia++;
				}
			}
		}
		return energia;
	}
	
	public int getAforo() {
		return aforo;
	}
	
}
