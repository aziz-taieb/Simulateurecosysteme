package Anim;

public class Corbeau extends Oiseau{
	public int niv_intelligence;

	public Corbeau(String plumage, int niv_vision, int niv_chant, int niv_intelligence) {
		super(plumage, niv_vision, niv_chant);
		this.niv_intelligence = niv_intelligence;
	}

	public int getNiv_intelligence() {
		return niv_intelligence;
	}

	public void setNiv_intelligence(int niv_intelligence) {
		this.niv_intelligence = niv_intelligence;
	}
	
	
}
