package Veg;

public class Arbre {
	private String nom;
	private int age;
	private double hauteur;

	public Arbre(String nom, int age, double hauteur) {
		super();
		this.nom = nom;
		this.age = age;
		this.hauteur = hauteur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

}
