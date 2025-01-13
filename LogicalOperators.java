public class LogicalOperators{
	public static void main (String[] agrs){
		int x = 50;
		int y = 25;
		int z = 15;
		
		boolean result1 = (x > y) && (x <= z);
		System.out.println(result1);
		
		boolean result2 = (x > y) || (x <= z);
		System.out.println(result2);
		
		boolean result3 = !((x > y) && (x <= z));
		System.out.println(result3);
		
	}
}