package Anim;

public class Lion extends Mamifere implements Carnivore{

	private int poids;
	private String sexe;
	
	public Lion(int qtte_poil, int nb_glande, int poids, String sexe) {
		super(qtte_poil, nb_glande);
		this.poids = poids;
		this.sexe = sexe;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public  void manger() {};
	
}
