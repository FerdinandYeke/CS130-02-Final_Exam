package Final_Exam;
import java.util.Scanner;

public class Number_Odd_Even_GreaterOrLessthan_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int number = scan.nextInt();
		
		//This checks the variable to see if its odd and greater than 10
		if(number % 1 == 0 && number > 10)
		{
			System.out.println("The number "+number+""
					+ "\nis odd and greater than 10");
			
		}
		
		else if(number == 10)
		{
			System.out.println("The number "+number+" "
					+ "is even and equals 10.");
		}
		else if(number % 1 == 0 && number < 10)
		{
			System.out.println("The number "+number+""
					+ "\nis odd but it's not greater than 10");
			
		}
		
		else if(number % 2 == 0 && number > 10)
		{
			System.out.println("The number "+number+""
					+ "\nis not odd, but even and greater than 10");
			
		}
		
		else if(number % 2 == 0 && number < 10)
		{
			System.out.println("The number "+number+""
					+ "\nis not odd, but its even and not greater than 10");
			
		}
		
		else 
		{
			System.out.println("Invalid input! Please enter a valid input.");
		}

	}
}
