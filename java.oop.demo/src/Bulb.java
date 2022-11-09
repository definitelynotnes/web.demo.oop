
public class Bulb {
	boolean on;
	
	public void turnOn() {
		this.on = true;
	}
	
	public void turnOff() {
		this.on = false;
	}
	
	public String getStatus() {
		return (on ? "ON" : "OFF");
	}
}
