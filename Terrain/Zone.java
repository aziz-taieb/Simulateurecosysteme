package Terrain;
import java.awt.Color;

public abstract class Zone{
	protected int precipitation;
	protected int temperature;
  protected Color c;

  public int getPrecipitation() {
		return precipitation;
	}

  public void setPrecipitation(int precipitation) {
		this.precipitation = precipitation;
	}

  public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

  public Color getColor() {
		return c;
	}

	public void setColor(Color c){
		this.c=c;
	}
}
