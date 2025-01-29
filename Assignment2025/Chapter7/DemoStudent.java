class Student{
	int studentID = 101;
	String name = "John";
	int age = 15;
	String gender = "Male";
	
	public void study(){
		System.out.printf("Student's ID : %d%n", studentID);
		System.out.printf("Student's name : %s%n", name);
		System.out.printf("Student's age : %d%n", age);
		System.out.printf("Student's gender : %s%n", gender);
		System.out.println("I am Learning Java");
	}
}

public class DemoStudent{
	public static void main (String agrs[]){
		Student student = new Student();
		student.study();
	}
}