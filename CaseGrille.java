import java.awt.Color;
import java.util.LinkedList;
import Anim.*;
import Veg.*;
import Ecosys.*;
import Terrain.*;

class CaseGrille{

    public Color c;
    public LinkedList<Disque> lDisques;
    public LinkedList<Animal> lAnim;
    public int nbRED;
    public int nbBLACK;
    public int rb1,rb2;
    public int[]evolutionproie;
    public int[]evolutionpredateur;
    public Zone z;
    CaseGrille(){
    	nbRED=0;
    	nbBLACK=0;
        lDisques=new LinkedList<Disque>();
        lAnim=new LinkedList<Animal>();
        evolutionproie= new int[100];
        for(int i=0; i<100; i++){
    			evolutionproie[i]=0;
    		}
        evolutionpredateur= new int[100];
        for(int i=0; i<100; i++){
    			evolutionpredateur[i]=0;
    		}
    }

    public void setZone(Zone z){
      this.z=z;
    }
    public void setCouleur(Color c){this.c=c;}
    public Color getCouleur(){
      return c;
    }


    public void addDisque(int rayon, Color c,int p,int t, String nom,int age,int et){
			lDisques.add(new Disque(rayon,c,p,t));
			lAnim.add(new Animal(nom,age,et));
		  if(c.equals(Color.RED)){
		    nbRED++;
		  }else {
		    nbBLACK++;
		  }
    }
    public void removeDisque(Color c1){
    	int i=0;
      for(Disque d :lDisques){

        if(d.c.equals(c1)){
          lDisques.remove(d);
          lAnim.remove(i);
          if(c1.equals(Color.RED))
        	  nbRED--;
          else
        	  nbBLACK--;
          break;
        }
        i++;
      }
    }
}
