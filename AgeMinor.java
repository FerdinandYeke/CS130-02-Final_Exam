package Final_Exam;
import java.util.Scanner;

public class AgeMinor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("In the United states as of 1995, minor\n"
				+ "is generally legally defined as a person under\n"
				+ "the age of 18: ");
		
		System.out.println("");
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		
		if(age<18)
		{
			System.out.println("Your age is "+age+", which means \n"
					+ "that you are still in you youth. Enjoy it\n"
					+ " while it last!");
		}
		
		else 
		{
			System.out.println("Your age is "+age+", which means \n"
					+ "that you are an adult. Enjoy it\n"
					+ " while it last, and remember to \n"
					+ "take some responsibilites!");
			
		}
		
	
		
	}

}
