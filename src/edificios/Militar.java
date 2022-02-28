package edificios;

public abstract class Militar extends Construccion {
	
	protected int ataque;
	protected int defensa;
	
	public Militar(int ataque, int defensa) {
		super();
		this.ataque=ataque;
		this.defensa=defensa;
	}
	
	public int getAtaque() {
		return ataque;
	}
	
	public int getDefensa() {
		return defensa;
	}
	
}
