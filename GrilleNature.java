import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import Ecosys.Animal;

import java.util.Random;

public class GrilleNature extends JPanel
{
	private int nbCasesL, nbCasesH;
        private int nbPixelCoteCase;
        public CaseGrille[][] m;


    /**
	 * Constructeur.
	 * @param nbCasesL La largeur (en nombre de cases) de la grille.
	 * @param nbCasesH La hauteur (en nombre de cases) de la grille.
	 * @param nbPixelCoteCase Nb de Pixel d'une case de la grille
	 **/
        GrilleNature(int nbCasesL, int nbCasesH, int nbPixelCoteCase) {
	    int i,j;
	    	this.nbCasesL = nbCasesL;
		this.nbCasesH = nbCasesH;
		this.nbPixelCoteCase = nbPixelCoteCase;

		JFrame window = new JFrame();
		window.setSize(nbCasesL*nbPixelCoteCase+50, nbCasesH*nbPixelCoteCase+50);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(this);
		window.setVisible(true);

	        this.m = new CaseGrille[nbCasesL][nbCasesH];
		for (i=0;i<nbCasesL;i++)
		    for (j=0;j<nbCasesH;j++)
			m[i][j]=new CaseGrille();
	}

        public void redessine(){
	    repaint();
        }

         public void colorieFond(int i, int j, Color c){
	     m[i][j].setCouleur(c);
         }

         public void addDisque(int i, int j, int rayon, Color c,int x,int y,Animal a){
	     m[i][j].addDisque(rayon,c,x,y,a.getNom(),a.getAge(),a.getEtat_sante());
	 }


       @Override
	//Fonction d'affichage de la grille appelée par repaint
	protected void paintComponent(Graphics g)
	{
	    //Colorie les cases de casesAColorier
	 	super.paintComponent(g);
		int i,j;
	        for (i=0;i<nbCasesL;i++)
		    for (j=0;j<nbCasesH;j++)

		    {
			int cellX = 10 + (i * nbPixelCoteCase);
			int cellY = 10 + (j * nbPixelCoteCase);
			g.setColor(m[i][j].getCouleur());
			g.fillRect(cellX, cellY, nbPixelCoteCase, nbPixelCoteCase);

   		        // Place des disques

  		        for (Disque d: m[i][j].lDisques){
  	  			    g.setColor(d.getCouleur());
  	  			    g.fillOval(d.x,d.y,d.getRayon(),d.getRayon());

  		        }
		    }



    	   // Redessine la grille
		g.setColor(Color.BLACK);
		g.drawRect(10, 10, nbCasesL*nbPixelCoteCase, nbCasesH*nbPixelCoteCase);

		for (i = 10; i <= nbCasesL*nbPixelCoteCase; i += nbPixelCoteCase) {
			g.drawLine(i, 10, i, nbCasesH*nbPixelCoteCase+10);
		}

		for (i = 10; i <= nbCasesH*nbPixelCoteCase; i += nbPixelCoteCase) {
			g.drawLine(10, i, nbCasesL*nbPixelCoteCase+10, i);
		}
	}
	public void sedeplacer(int i, int j,Color c){
		int[] tab = new int[8];
		int nb=0;
		int p=0;
		int x;
		for (x = 0; x < 8; x++)
			tab[x] = 0;

		if (i - 1 >= 0 && j - 1 >= 0){
			tab[0] = 1;
			nb++;
		}
		if (i - 1 >= 0){
			tab[1] = 1;
			nb++;
		}
		if (i - 1 >= 0 && j +1< nbCasesH){
			tab[2] = 1;
			nb++;
		}
		if (j - 1 >= 0){
			tab[3] = 1;
			nb++;
		}
		if (j + 1 < nbCasesH){
			tab[4] = 1;
			nb++;
		}
		if (i + 1 < nbCasesL && j - 1 >= 0){
			tab[5] = 1;
			nb++;
		}
		if (i+1< nbCasesL){
			tab[6] = 1;
			nb++;
		}
		if (i+1< nbCasesL && j + 1 < nbCasesH){
			tab[7] = 1;
			nb++;
		}
		Random r = new Random ();
		p=r.nextInt (nb);
		for(x=0;x<8;x++){
			if(tab[x]==1){
				if(p==0){
					break;
				}
				p--;
			}
		}
		int ifinal=0 , jfinal=0;
		switch (x) {
						case 0:
						ifinal=i-1;
						jfinal=j-1;
								break;
            case 1:
						ifinal=i-1;
						jfinal=j;
                break;
            case 2:
						ifinal=i-1;
						jfinal=j+1;
                break;
            case 3:
						ifinal=i;
						jfinal=j-1;
								break;
            case 4:
						ifinal=i;
						jfinal=j+1;
								break;
            case 5:
						ifinal=i+1;
						jfinal=j-1;
								break;
            case 6:
						ifinal=i+1;
						jfinal=j;
								break;
            case 7:
						ifinal=i+1;
						jfinal=j+1;
								break;
            default:
                System.out.println("Invalid");
                break;
        }
				this.addDisque(ifinal, jfinal, 15 - 2 * this.m[ifinal][jfinal].rb1, c,r.nextInt (80) + 10 + (ifinal * 100),r.nextInt (80) + 10 + (jfinal * 100),new Animal("coco",13,13));
				this.m[i][j].removeDisque(c);
	}
}
