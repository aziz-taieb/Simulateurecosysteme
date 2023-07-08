package Veg;

public class Baobab extends Arbre{
	private int longevite;
	private int niv_importance;
	
	public int getLongevite() {
		return longevite;
	}

	public void setLongevite(int longevite) {
		this.longevite = longevite;
	}

	public int getNiv_importance() {
		return niv_importance;
	}

	public void setNiv_importance(int niv_importance) {
		this.niv_importance = niv_importance;
	}

	public Baobab(String nom, int age, double hauteur, int longevite, int niv_importance) {
		super(nom, age, hauteur);
		this.longevite = longevite;
		this.niv_importance = niv_importance;
	}
}
