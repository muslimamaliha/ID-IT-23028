import java.util.Scanner;
public class Ch2Ex19
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.print("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3 : ");

double x1 = input.nextDouble();
double y1 = input.nextDouble();
double x2 = input.nextDouble();
double y2 = input.nextDouble();
double x3 = input.nextDouble();
double y3 = input.nextDouble();

double  side1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
 double side2 = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
 double side3 = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));

double s = (side1+side2+side3)/2;
double area = Math.sqrt( s*(s-side1)*(s-side2)*(s-side3) );
System.out.println("The area of the triangle is "+area);

input.close();
}
}





