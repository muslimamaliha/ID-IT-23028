import java.util.Scanner;
public class Ch2Ex5
{
 public static void main(String[] args)
{
  Scanner input=new Scanner(System.in);
  System.out.print("Enter the subtotal and gratuity rate : ");
  double subtotal=input.nextDouble();
  double gratuity_rate=input.nextDouble();

   double gratuity = subtotal*(gratuity_rate/100.0)  ;
   double total = gratuity+subtotal;

   System.out.println("The gratuity is $"+gratuity+" and total is $"+total);
}
}