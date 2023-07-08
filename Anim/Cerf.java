package Anim;

public class Cerf extends Mamifere implements Herbivore  {
	private int taille;

	public Cerf(int qtte_poil, int nb_glande, int taille) {
		super(qtte_poil, nb_glande);
		this.taille = taille;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}
	public void manger() {};
	
}
