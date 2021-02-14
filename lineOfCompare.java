import java.util.Scanner;

public class lineOfCompare
{
	public int x1,x2,y1,y2;
	public double lengthOfLine;
	public double line1,line2;
	public double lengthCalculation()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Value Of X1 ,Y1,X2,Y2");
                x1 = sc.nextInt();
		y1 = sc.nextInt();
                x2 = sc.nextInt();
		y2 = sc.nextInt();
		lengthOfLine = Math.sqrt((x2-x1)^2+(y2-y1)^2);

		return lengthOfLine;
	}
	public void comparisonOfLine()
	{
		lengthCalculation();

		System.out.println(" ************* Distance Between Line X and Y ************** ");
		System.out.println("Value of X1:-" +x1+ "\t\t Value of Y1:-"+y1);
		System.out.println("Value of X2:-" +x2+ "\t\t Value of Y2:-"+y2);
		System.out.println("***********************************************************");
               	System.out.println("Distance Between Line is:-"+lengthOfLine);
	}

	public  void equalLine()
	{
		System.out.println("-------------------------------------------------Line 1---------------------------------------------------");
		comparisonOfLine();
		line1=lengthOfLine;

		System.out.println("-------------------------------------------------Line 2---------------------------------------------------");
                comparisonOfLine();
                line2=lengthOfLine;

		if(line1 == line2)
		{
			 System.out.println("Lines Are Equal");
		}
		else
		{
			 System.out.println("Lines Are Not Equal");
		}
	}
	public static void main(String args[])
	{
		lineOfCompare line = new lineOfCompare();

		line.equalLine();
	}
}
