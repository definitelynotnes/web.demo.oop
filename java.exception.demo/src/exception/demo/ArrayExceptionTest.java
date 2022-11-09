package exception.demo;

public class ArrayExceptionTest {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		
		for(int index = 0; index <= numbers.length; index++) {
			try {
				System.out.println(numbers[index]);
				System.out.println("~~~~~~after");
				
				String strNum = "ABC";
				int i = Integer.parseInt(strNum);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid array index: " + e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Invalid string value: " + e.getMessage());
				e.printStackTrace();
				
			} catch (Exception e) {
				System.out.println("Unknown error: " + e.getMessage());
			} finally {
				System.out.println("End of execution");
			}
		}
	}
}
