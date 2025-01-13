import java.util.Scanner;


public class NestedIfElseStatement{
	public static void main (String[] agrs) {
		Scanner scan = new Scanner (System.in);
		
		int mark;
		String name ;
		System.out.print("Enter your name: ");
		name = scan.nextLine();
		
		System.out.print("Enter your mark: ");
		mark = scan.nextInt ();
		
		if (mark >= 90)
			System.out.println(name + " your grade is outstanding");
		
		else if(mark >= 75)
			System.out.println(name + " your grade is Excellent");
		
		else if(mark >= 55)
			System.out.println(name + " your grade is Good");
		
		else if(mark >= 45)
			System.out.println(name + " your grade is Average");
		
		else
			System.out.println(name + " your grade is Very Poor");
	}
}