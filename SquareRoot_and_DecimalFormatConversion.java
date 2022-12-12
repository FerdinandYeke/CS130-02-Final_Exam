package Final_Exam;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SquareRoot_and_DecimalFormatConversion {
	
	public static void main(String[]args)
	{
		DecimalFormat d1 = new DecimalFormat("0.##");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a double-floating point number: ");
		float number = scan.nextFloat();
		
		float result = (float) Math.sqrt(number);
		
		System.out.println("The result of the number "+number+
				" after its square rooted is: "+result);
		
		System.out.println("");
		System.out.println("The formatted result is: "+d1.format(result));
		
	}

}
