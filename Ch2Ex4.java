import java.util.Scanner;
public class Ch2Ex4
{
 public static void main(String[] args)
{
  Scanner input=new Scanner(System.in);
  System.out.print("Enter a number in pounds : ");
  double val=input.nextDouble();

   double ans = val*.454 ;

   System.out.println(+val+" pounds is = "+ans+" kilograms");
}
}