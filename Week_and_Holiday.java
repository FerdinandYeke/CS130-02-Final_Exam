package Final_Exam;
import java.util.Scanner;


public class Week_and_Holiday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n1.Monday \n2.Tuesday \n3.Wendsday"
				+ " \n4.Thursday \n5.Friday \n6.Saturday \n7.Sunday");
		System.out.println("");
		System.out.println("Enter the number of the day of the week"
				+ "(anything else is a holiday): ");
		int choice = scan.nextInt();
		
		switch(choice)
		{
		case 1:
			{
				System.out.println("It's Monday!");
			}
		break;
			
		case 2:
			{
				System.out.println("It's Tuesday!");
			}
		break;
		
		case 3:
			{
				System.out.println("It's Wendsday!");
			}
			break;
		
		case 4:
			{
				System.out.println("It's Thursday!");
			}
		break;
		
		case 5:
			{
				System.out.println("It's Friday!");
			}
		break;
		
		case 6:
			{
				System.out.println("It's Saturday!");
			}
		break;
		
		case 7:
			{
				System.out.println("It's Sunday!");
			}
			break;
			
			default:
				System.out.println("Holiday");
				System.out.println("Enter the Holiday: ");
				String holiday = scan.next();
				
				System.out.println("Well, Happy Holidays!");
				
				break;
		}

	}

}
