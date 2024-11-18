import java.util.Scanner;
public class Ch2Ex16
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);

System.out.print("Enter the length of the side : ");
double s= input.nextDouble();

double area = (3*Math.sqrt(3)/2.0)*(s*s); 

System.out.println("The area of the hexagon is "+area);
input.close();
}
}

