package edificios;

public class Gestor {
	
	
	private Castillo cast;
	private Piramide pir;
	private Estadio est;
	private Edificio edi;
	
	
	public static void main(String [] args) {
		Gestor unGestor=new Gestor();
	}
	
	public Gestor() {
		cast=new Castillo();
		//pir=new Piramide();
		//est=new Estadio();
		//edi=new Edificio();
		
		
		
		System.out.println("Energia");
		System.out.println(cast.generarEnergia());
		
		System.out.println("Ataque");
		System.out.println(cast.getAtaque());
		
		System.out.println("Defensa");
		System.out.println(cast.getDefensa());
		
		System.out.println("Numero plantas");
		System.out.println(cast.getNumeroPlantas());
		
		System.out.println("Aforo");
		System.out.println(cast.aforo);
		
	}
	
}
