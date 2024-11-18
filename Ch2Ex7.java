import java.util.Scanner;
public class Ch2Ex7
{
 public static void main(String[] args)
{
  Scanner input=new Scanner(System.in);
  int  min, days ,year , rem_days;
  System.out.print("Enter the number of minute : ");

  min = input.nextInt();
  days=min/(24*60);
  year=days/365;
   rem_days=days%365;

System.out.println(+min+" minutes is approximately "+year+" years and "+rem_days+" days");
input.close();
}
}
  
   
  
