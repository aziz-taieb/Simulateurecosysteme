package Terrain;
import java.awt.Color;
import java.util.Random;
public class Foret extends Zone{

	public Foret() {
		super();
		Random r = new Random ();
		setPrecipitation(200+r.nextInt(100));
		setTemperature(10+r.nextInt(15));
		setColor(Color.GREEN);
	}

}
