package Veg;

public class Chene extends Arbre{
	private String feuillage;
	private String ecorce;
	private int longevite;
	
	public Chene(String nom, int age, double hauteur, String feuillage, String ecorce, int longevite) {
		super(nom, age, hauteur);
		this.feuillage = feuillage;
		this.ecorce = ecorce;
		this.longevite = longevite;
	}

	public String getFeuillage() {
		return feuillage;
	}

	public void setFeuillage(String feuillage) {
		this.feuillage = feuillage;
	}

	public String getEcorce() {
		return ecorce;
	}

	public void setEcorce(String ecorce) {
		this.ecorce = ecorce;
	}

	public int getLongevite() {
		return longevite;
	}

	public void setLongevite(int longevite) {
		this.longevite = longevite;
	}
	
	
	
	
}
