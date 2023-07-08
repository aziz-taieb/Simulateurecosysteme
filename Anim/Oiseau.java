package Anim;

public class Oiseau {
	private String plumage;
	private int niv_vision;
	private int niv_chant;
	
	public Oiseau(String plumage, int niv_vision, int niv_chant) {
		super();
		this.plumage = plumage;
		this.niv_vision = niv_vision;
		this.niv_chant = niv_chant;
	}
	public String getPlumage() {
		return plumage;
	}
	public void setPlumage(String plumage) {
		this.plumage = plumage;
	}
	public int getNiv_vision() {
		return niv_vision;
	}
	public void setNiv_vision(int niv_vision) {};
}