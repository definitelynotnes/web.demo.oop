
public class Switch {
	String brand;
	Bulb bulb;
	// in checking state, throw illegal argument exception to ensure the state
	public void setBulb(Bulb bulb) {
		if (bulb == null) { // guarding the state
			throw new IllegalArgumentException("Bulb cannot be null");
		} // null value exception happens when a memory pointer does not exit
		this.bulb = bulb;
	}
	
	public void switchOn() {
		bulb.turnOn();
	}
	
	public void switchOff() {
		bulb.turnOff();
	}
	
	public void showStatus() {
		System.out.println("Status: " + bulb.getStatus());
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
		brand = "hello";
	}
}
