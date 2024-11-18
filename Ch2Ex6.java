import java.util.Scanner;
public class Ch2Ex6
{
 public static void main(String[] args)
{
  Scanner input=new Scanner(System.in);
  System.out.print("Enter a number between 0 and 1000 : ");
  int  num,rem,sum=0;
  num = input.nextInt();
  
 while(num>0)
{
    rem= num%10;
    sum+=rem;
    num/=10;
}
System.out.println("The sum of the digits is "+sum);
input.close();
}
}
