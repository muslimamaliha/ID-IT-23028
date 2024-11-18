import java.util.Scanner;
public class Ch2Ex14
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);

System.out.print("Enter weight in pounds : ");
double weight = input.nextDouble();

System.out.print("Enter height in inches : ");
double height  = input.nextDouble();

double BMI = (weight*.45359237)/(height*.0254*height*.0254);
System.out.println("BMI is  "+BMI);
input.close();
}
}

