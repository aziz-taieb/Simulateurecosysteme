package Anim;

public class Abeille extends Insecte{
	private boolean est_polonisateur;

	public Abeille(int nb_pattes, int nb_antennes, int nb_ailes, boolean est_polonisateur) {
		super(nb_pattes, nb_antennes, nb_ailes);
		this.est_polonisateur = est_polonisateur;
	}

	public boolean isEst_polonisateur() {
		return est_polonisateur;
	}

	public void setEst_polonisateur(boolean est_polonisateur) {
		this.est_polonisateur = est_polonisateur;
	}
	
	
}
