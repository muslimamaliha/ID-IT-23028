import java.util.Scanner;
public class FactorionCal {

//function to cal factorial
 public static int factorial(int digit)  //int=return type method will return
 {
  int fact=1;
  for(int j=1; j<=digit ; j++)
     {  
       fact*=j;
      }
   return fact;
  }

public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the lower bound of the range : ");
    int s = sc.nextInt();
    System.out.println("Enter the upper bound of the range : ");
    int e = sc.nextInt();
    int count=0;

    for(int i =s ; i<=e; i++)
    {
      int sum=0,temp=i;

       while(temp>0)
       {
        int digit = temp % 10;
        sum = sum+ factorial(digit); // method(argument)
        temp = temp/10;
       }
     if(sum==i)
      {  count++; 
         System.out.println("Factorion no : "+i); 
       }
     }
if(count>0)
   {System.out.println("Factorion number in the  range : "+count);}
  else
     { System.out.println("No factorion numbers found in the given range."); }

  sc.close();
  }
}
