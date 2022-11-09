
public class Calculator {
	/*	public void computeSum(int[] numbers) {
	int sum=0;
	for(int number: numbers) {
		sum+=number;
	}
	System.out.println("Sum: " + sum);
}
*/	
	public void computeSum(int... numbers) {
		int sum = 0; // local variables does not have default values. Yun lang mga after ng class ang meron.
		// int sum = 1_000_000_000; 
		for (int number : numbers) {
			sum += number;
		}
		System.out.println("Sum: " + sum);
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		//calculator.computeSum(new int[]{1, 2, 3});
		calculator.computeSum(1, 2, 3);
	}
}
