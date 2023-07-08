package Ecosys;

public class Animal implements EtreVivant{
	private String nom;
	private int age;
	private int etat_sante;
	
	public Animal(String nom, int age, int etat_sante) {
		super();
		this.nom = nom;
		this.age = age;
		this.etat_sante = etat_sante;
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
	public int getEtat_sante() {
		return etat_sante;
	}
	public void setEtat_sante(int etat_sante) {
		this.etat_sante = etat_sante;
	}
	public void se_reproduire() {};
	
	
	
	
}
