public class TypeCasting{
	public static void main (String[] args){
	//widening (inplicit) from int to double
	int num1 = 100;
	double d = (double) num1;
	
	System.out.println(d) ;
	
	//Naeeowing (Explicit) from Long to int
	long longValue = 10000000000L;
	int intValue = (int) longValue;
	
	System.out.println (intValue);
	
	//Explicit conversion but data will be lost
	double num = 100.99;
	int i = (int) num;
	System.out.println(i);
	}
}	