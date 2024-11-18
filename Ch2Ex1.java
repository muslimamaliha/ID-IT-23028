import java.util.Scanner;
public class Ch2Ex1
{
 public static void main(String[] args)
{
  Scanner input=new Scanner(System.in);
  System.out.print("Enter value in celcious : ");
  double val=input.nextDouble();

  double ans=(val*9)/5+32;

   System.out.println("Ans is = "+ans+ " Fahrenheit");
}
}