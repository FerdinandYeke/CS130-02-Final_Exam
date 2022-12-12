package Final_Exam;

public class RectangleClass {

	private int height;
	private int width;
	
	
	public RectangleClass(int height, int width)
	{
		this.height = height;
		this.width = width;
	}
	
	public double areaRec()
	{
		double area = height * width;
		return area;
	}
	
	public double periRec()
	{
		double Perimeter = (height + width)+(height + width);
		return Perimeter;
	}
	
	//Main Starts here
	
	public static void main(String []args)
	{
		RectangleClass rect = new RectangleClass(10,20);
		
		System.out.println("The Area of Rectange of height 10 and \n"
				+ "width 20 is: "+rect.areaRec());
		System.out.println("");
		System.out.println("The Perimeter of Rectangle of height 10 and \n"
				+ "width 20 is: "+rect.periRec());
		
	}
}
