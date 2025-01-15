import java.util.Random;

public class RandomNumbers{
	public static void main(String args[]){
		Random random = new Random();
		
		//create a variable to store the random number generated.
		int randomNum = random.nextInt();
		
		//print the random number
		System.out.printf("Random Number is : %d%n", randomNum);
		
		//Generating a number within a range
		int randomNumInRange = random.nextInt(20) + 1;
		System.out.printf("Random Number In Range is : %d%n", randomNumInRange);
		
		//Generating a float point or decimal number
		double floatPointNum = random.nextDouble();
		System.out.printf("Random Number is : %.2f%n", floatPointNum);
		
		//Genetrating a float point value within the 
		
		double min = 10.0;
		double max = 20.0;
		
		double randomFloatInRange = min + (max - min)* random.nextDouble();
		System.out.printf("Random Double Number is : %.2f%n", randomFloatInRange);
		
		//Generate a random boolean value
		boolean booleanValue = random.nextBoolean();
		
		//print
		System.out.printf("Random Boolean Value is : %b%n",booleanValue);
	}
}