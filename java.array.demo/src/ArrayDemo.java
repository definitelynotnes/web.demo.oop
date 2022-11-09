
public class ArrayDemo {

	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "John";
		names[1] = "Luke";
		names[2] = "Peter";
		names[3] = "Matthew";
		names[4] = "Ted";
		
		for (String name: names)
		{
			System.out.println(String.format("Name: %s", name));
		}
		
/*		if (args.length == 0)
		{
			System.out.println("You need to pass required arguments");
			return;
		}
		
		for (String arg: args)
		{
			System.out.println("Argument: " + arg);
		}
		
		
		
		int array1[];
		int[] array2;
		int [] array3;
		
		int[] numberSet1 = {1, 2, 3, 4, 5};
		// ordered/unordered
		// sorted/unstored
		// unique/duplicate
		String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		System.out.println("How many days are there in a work week " + dayNames.length);
		
		for (int index = 0; index < dayNames.length; index++)
		{
			System.out.println(String.format("Day Name: %s", dayNames[index]));
		}
		for(String dayName: dayNames) {
			System.out.println(String.format("Day Name: %s ", dayName));
		}
*/	}

}

