import java.util.Scanner;
public class Ch2Ex2
{
 public static void main(String[] args)
{
  Scanner input=new Scanner(System.in);
  System.out.print("Enter value of radius and length : ");
  double radius=input.nextDouble();
   double length=input.nextDouble();

   double area = radius*radius*3.14159;
   double volume = area*length;

   System.out.println("Area is = "+area+ " and Volume is : "+volume);
}
}