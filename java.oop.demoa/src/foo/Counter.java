package foo;

public class Counter {
	private static int value;
	
	public void increment() {
		value++;
	}
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		c1.increment();
		c2.increment();
		c1.increment();
		
		System.out.println("C1: " + c1.getValue());
		System.out.println("C1: " + c2.getValue());
	}
}
 