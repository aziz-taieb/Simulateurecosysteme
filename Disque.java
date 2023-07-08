import java.awt.Color;

class Disque{

    private int rayon;
    public Color c;
    public int x;
    public int y;
    

    Disque(){}

    Disque(int rayon,Color c, int p, int t)
    {
		this.rayon=rayon;
		this.c=c;
		this.x=p;
		this.y=t;
    }

    public int getRayon(){ return rayon;}
    public void setRayon(int rayon){this.rayon=rayon;}
    public Color getCouleur(){ return c;}
    public void setCouleur(Color c){this.c=c;}



}
