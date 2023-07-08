package Anim;

public class Fourmi extends Insecte{
	private boolean est_la_reine;

	public Fourmi(int nb_pattes, int nb_antennes, int nb_ailes, boolean est_la_reine) {
		super(nb_pattes, nb_antennes, nb_ailes);
		this.est_la_reine = est_la_reine;
	}

	public boolean isEst_la_reine() {
		return est_la_reine;
	}

	public void setEst_la_reine(boolean est_la_reine) {
		this.est_la_reine = est_la_reine;
	}
	
	
}
