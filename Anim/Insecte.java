package Anim;

public class Insecte {
	private int nb_pattes;
	private int nb_antennes;
	private int nb_ailes;
	
	public Insecte(int nb_pattes, int nb_antennes, int nb_ailes) {
		super();
		this.nb_pattes = nb_pattes;
		this.nb_antennes = nb_antennes;
		this.nb_ailes = nb_ailes;
	}

	public int getNb_pattes() {
		return nb_pattes;
	}

	public void setNb_pattes(int nb_pattes) {
		this.nb_pattes = nb_pattes;
	}

	public int getNb_antennes() {
		return nb_antennes;
	}

	public void setNb_antennes(int nb_antennes) {
		this.nb_antennes = nb_antennes;
	}

	public int getNb_ailes() {
		return nb_ailes;
	}

	public void setNb_ailes(int nb_ailes) {
		this.nb_ailes = nb_ailes;
	}
	
	
	
	
}
