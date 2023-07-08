package Ecosys;

public class Vegetal implements EtreVivant{
	private int nom;
	private double Temps_critique;
	private double niv_critique;
	
	public Vegetal(int nom, double temps_critique, double niv_critique) {
		super();
		this.nom = nom;
		Temps_critique = temps_critique;
		this.niv_critique = niv_critique;
	}
	public int getNom() {
		return nom;
	}
	public void setNom(int nom) {
		this.nom = nom;
	}
	public double getTemps_critique() {
		return Temps_critique;
	}
	public void setTemps_critique(double temps_critique) {
		Temps_critique = temps_critique;
	}
	public double getNiv_critique() {
		return niv_critique;
	}
	public void setNiv_critique(double niv_critique) {
		this.niv_critique = niv_critique;
	}
	public void se_reproduire() {};
	
	
	
}
