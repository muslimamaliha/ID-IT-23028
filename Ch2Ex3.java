import java.util.Scanner;
public class Ch2Ex3
{
 public static void main(String[] args)
{
  Scanner input=new Scanner(System.in);
  System.out.print("Enter value in feet : ");
  double val=input.nextDouble();

   double ans = val*0.305 ;

   System.out.println(+val+" feet is = "+ans+" meters");
}
}