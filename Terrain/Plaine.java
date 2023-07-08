package Terrain;
import java.awt.Color;
import java.util.Random;
public class Plaine extends Zone{

	public Plaine() {
		super();
		Random r = new Random ();
		setPrecipitation(100+r.nextInt(100));
		setTemperature(30+r.nextInt(15));
		setColor(Color.ORANGE);
	}
}
