package Terrain;
import java.awt.Color;
import java.util.Random;
public class Desert extends Zone{

	public Desert() {
		super();
		Random r = new Random ();
		setPrecipitation(r.nextInt(25));
		setTemperature(40+r.nextInt(20));
		setColor(Color.YELLOW);
	}
}
