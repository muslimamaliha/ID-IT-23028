import java.util.Scanner;
public class Ch2Ex12
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.print("Enter speed and acceleration : ");
double v = input.nextDouble();
double a = input.nextDouble();

double length = (v*v)/(2*a);
System.out.println("The minimum runway length for this airplane is "+length);
input.close();
}
}

