
public class Product {
	int id;
	String name;
	float price;
	int quantity;
	
	public Product(int id, String name, float price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		if (price<0) { // protecting the state of the object
			throw new IllegalArgumentException("Invalid price.");
		}
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public float getTotalPrice() {
		return getPrice() * getQuantity();
	}
	
	public static void main(String[] args) {
		Product product1 = new Product(1,"Headphones", 100, 1);
		Product product2 = product1;
		Product product3 = product2;
		Product product4 = product3;
		Product product5 = product4; // 1 object
		
		product1 = null;
		product2 = null;
		product3 = null;
		product4 = null;
		product5 = null;
	}
	
}
