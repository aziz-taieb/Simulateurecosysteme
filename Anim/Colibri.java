package Anim;

public class Colibri extends Oiseau{
	private int taille;

	public Colibri(String plumage, int niv_vision, int niv_chant, int taille) {
		super(plumage, niv_vision, niv_chant);
		this.taille = taille;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	
}
