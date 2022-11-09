
public class TwoDimensionalArray {

	public static void main(String[] args) {
		if(args.length == 0) 
		{
			System.out.println("Unable to run application. Missing argument.");
			return;
		}
		
		int code = Integer.parseInt(args[0]);
		String environment = code == 0 ? "production" : "test";
		if (code == 0)
		{
			environment = "production";
		} else
		{
			environment = "test";
		}
		
		System.out.println(String.format("Running in %s environment ", environment));
		
		String[][] data = {
				{"A","B","C"},
				{"D","E","F"},
				{"G","H","I"}
		};
		System.out.println(data[0][0]); // A
		System.out.println(data[1][1]); // E
		
		for (int x = 0; x < data.length; x++)
		{
			for(int y = 0; y < data.length; y++)
			{
				System.out.println(String.format("data[%s][%s] = %s", x, y, data[x][y]));
			}
		}
		
		for(String[] row:data) {
			for(String columnData: row) {
				System.out.println(String.format("Data: %s", columnData));
			};
		}
	}
}


