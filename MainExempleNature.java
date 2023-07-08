import javax.swing.JFrame;
import java.util.Random;
import java.awt.Color;
import Ecosys.*;
import Terrain.*;

public class MainExempleNature
{
  public static void main (String[]args)
  {
    int nbCasesL = 5, nbCasesH = 6;
    int k = 0;
    int nbjour = 100;
// On crée une Grille "Logique"  objet ChampGraphique de 50 cases de large, et 60 de haut de 20 pixels de côté
    GrilleNature grille = new GrilleNature (nbCasesL, nbCasesH, 100);

    Random r = new Random ();
    int p1 = 7, p2 = 3, p3 = 4, p4 = 2, p5 = 25, p6 =65, p7=20;
    int rayonproie = 1;
    int i, j, r1, r2, z = 0;

    for (i = 0; i < nbCasesL; i++)
      for (j = 0; j < nbCasesH; j++)
	{
	  if (i < j){
      grille.m[i][j].setZone(new Plaine());
      grille.colorieFond (i,j,grille.m[i][j].z.getColor());
    }
	  else{
      grille.m[i][j].setZone(new Foret());
      grille.colorieFond (i,j,grille.m[i][j].z.getColor());
    }
	}

    grille.redessine ();

    //Puis, pause de 2s
    try
    {
      Thread.sleep (50);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace ();
    }


    for (i = 0; i < nbCasesL; i++)
      for (j = 0; j < nbCasesH; j++)
	{

// Place des disques au hasard
	  grille.m[i][j].rb1 = r.nextInt (p1);
	  grille.m[i][j].rb2 = r.nextInt (p2);
	  for ( k = 0; k < grille.m[i][j].rb1; k++)
	    grille.addDisque (i, j, 15 - 2 * grille.m[i][j].rb1, Color.RED,
			      r.nextInt (80) + 10 + (i * 100),
			      r.nextInt (80) + 10 + (j * 100),new Animal("coco",12,12));
	  for (k = 0; k < grille.m[i][j].rb2; k++)
	    grille.addDisque (i, j, 15 - 2 * grille.m[i][j].rb2, Color.BLACK,
			      r.nextInt (80) + 10 + (i * 100),
			      r.nextInt (80) + 10 + (j * 100),new Animal("coco",12,12));


	  //Puis, pause de 2s
	  try
	  {
	    Thread.sleep (50);
	  }
	  catch (InterruptedException e)
	  {
	    e.printStackTrace ();
	  }

	  grille.redessine ();
	}

    while (z < nbjour)
      {
	for (i = 0; i < nbCasesL; i++){
	  for (j = 0; j < nbCasesH; j++)
	    {
				if(grille.m[i][j].evolutionproie[z]>0){
					grille.addDisque (i, j, 15 - 2 * grille.m[i][j].rb1, Color.RED,r.nextInt (80) + 10 + (i * 100),r.nextInt (80) + 10 + (j * 100),new Animal("coco",12,12));
				}
				if(grille.m[i][j].evolutionpredateur[z]>0){
					while(grille.m[i][j].evolutionpredateur[z]>0) {
						grille.addDisque (i, j, 15 - 2 * grille.m[i][j].rb2, Color.BLACK,r.nextInt (80) + 10 + (i * 100),r.nextInt (80) + 10 + (j * 100),new Animal("coco",12,12));
						grille.m[i][j].evolutionpredateur[z]--;
					}
				}
				if(grille.m[i][j].nbRED>=5 && grille.m[i][j].z instanceof Foret && z%2==1){
          grille.m[i][j].setZone(new Plaine());
          grille.colorieFond (i,j,grille.m[i][j].z.getColor());
        }else{
          if(grille.m[i][j].nbRED>=8 && grille.m[i][j].z instanceof Plaine && z%2==1){
            grille.m[i][j].setZone(new Desert());
            grille.colorieFond (i,j,grille.m[i][j].z.getColor());
          }
        }
        if(grille.m[i][j].nbRED<=2 && grille.m[i][j].z instanceof Plaine && z%2==1){
          grille.m[i][j].setZone(new Foret());
          grille.colorieFond (i,j,grille.m[i][j].z.getColor());
        }
	     if (grille.m[i][j].nbRED >= 2 && grille.m[i][j].nbBLACK == 0)
		{
		  grille.m[i][j].evolutionproie[z + p3]++;
		}
	     if (grille.m[i][j].nbBLACK >= 2 && grille.m[i][j].nbRED > 0)
		{
		  grille.m[i][j].evolutionpredateur[z + p4]++;
		}
	     while (k < grille.m[i][j].nbBLACK)
		{
		  if (r.nextInt (99) < p5 && grille.m[i][j].nbRED > 0)
		    {
					grille.m[i][j].removeDisque(Color.RED);
		    }
		  k++;
		}
		k=0;
    while (k < grille.m[i][j].nbBLACK)
    {
      if (r.nextInt (99) < p6){
        grille.sedeplacer(i,j,Color.BLACK);
      }
      k++;
	  }
  k=0;
    while (k < grille.m[i][j].nbRED)
    {
      if (r.nextInt (99) < p7){
        grille.sedeplacer(i,j,Color.RED);
      }
      k++;
    }
  //Puis, pause de 2s

}
}
	 try
	  {
	    Thread.sleep (500);
	  }
	  catch (InterruptedException e)
	  {
	    e.printStackTrace ();
	  }
	  grille.redessine ();
	z++;
}
}
}
