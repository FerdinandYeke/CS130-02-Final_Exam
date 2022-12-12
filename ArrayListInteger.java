package Final_Exam;
import java.util.Random;
import java.util.ArrayList;

public class ArrayListInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();
		ArrayList<Integer>Numbers = new ArrayList<Integer>();
		
		//A; This add 10 numbers by the i increment
		for(int i = 0; i<10; i++)
		{
			Numbers.add(i);
		}
		
		//B: sets each array element on a random generator between 0 to 30
		for(int i= 0; i<10; i++)
		{
			Numbers.set(i,generator.nextInt(0,30));
		}
		
		/*This prints out the array-list element indexes
		 * and prints out the Array element
		 */
		
		System.out.println("ArrayList and the Index: ");
		
		for(int i : Numbers )
		{
		System.out.println("Array index: "+Numbers.indexOf(i)+" Array element: "+i);
		}
	}

}
