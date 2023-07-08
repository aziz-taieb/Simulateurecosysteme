package Veg;

public class Lavande extends Vivace{
	private String odeur;
	private int niv_persistance_sol_sec;
	
	public Lavande(String couleur, String nom, String odeur, int niv_persistance_sol_sec) {
		super(couleur, nom);
		this.odeur = odeur;
		this.niv_persistance_sol_sec = niv_persistance_sol_sec;
	}

	public String getOdeur() {
		return odeur;
	}

	public void setOdeur(String odeur) {
		this.odeur = odeur;
	}

	public int getNiv_persistance_sol_sec() {
		return niv_persistance_sol_sec;
	}

	public void setNiv_persistance_sol_sec(int niv_persistance_sol_sec) {
		this.niv_persistance_sol_sec = niv_persistance_sol_sec;
	}
	
	
	
}
