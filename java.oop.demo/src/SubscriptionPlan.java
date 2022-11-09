
public class SubscriptionPlan {
	int id;
	String name;
	String type;
	float price;
	
	// method parameters - local variable
	public void setDetails(int id, String name, String type, float price) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println(String.format("ID: %s", this.id));
		System.out.println(String.format("Name: %s", this.name));
		System.out.println(String.format("Type: %s", this.type));
		System.out.println(String.format("Price: %s", this.price));
	}
/*	// property
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int computeSum() {
		
		return (int) (1 + 10.5);
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
