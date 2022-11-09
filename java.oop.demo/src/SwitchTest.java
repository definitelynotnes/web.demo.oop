
public class SwitchTest {

	public static void main(String[] args) {
		Bulb smartBulb = new Bulb();
		Switch touchScreenSwitch = new Switch();
		touchScreenSwitch.setBulb(smartBulb);
		touchScreenSwitch.showStatus();
		touchScreenSwitch.switchOn();
		touchScreenSwitch.showStatus();
		touchScreenSwitch.switchOff();
		touchScreenSwitch.showStatus();
		
		String brand = "GE";
		System.out.println("Before: " + brand);
		touchScreenSwitch.setBrand(brand);
		System.out.println("After: " + brand);
	}
}
