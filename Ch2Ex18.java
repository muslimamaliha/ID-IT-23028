//import java.util.Scanner;
public class Ch2Ex18
{
public static void main(String[] args)
{
//Scanner input = new Scanner(System.in);


System.out.print("a     b     pow(a,b)");
for(int a=1,b=2;a<=5;a++,b++)
{
  System.out.println(String.format("%-5d %-5d %-5d\n"+a+b+Math.pow(a,b)));
}
//input.close();
}
}

  
  


