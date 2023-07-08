package Veg;

public class Hemerocalle extends Vivace{
		private String couleur;
		private int periode_floralisation;
		
		public Hemerocalle(String couleur, String nom, String couleur2, int periode_floralisation) {
			super(couleur, nom);
			couleur = couleur2;
			this.periode_floralisation = periode_floralisation;
		}

		public String getCouleur() {
			return couleur;
		}

		public void setCouleur(String couleur) {
			this.couleur = couleur;
		}

		public int getPeriode_floralisation() {
			return periode_floralisation;
		}

		public void setPeriode_floralisation(int periode_floralisation) {
			this.periode_floralisation = periode_floralisation;
		}
		
		
		
		
}
