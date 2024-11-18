import java.util.Scanner;
public class Ch2Ex10
{
 public static void main(String[] args)
{
 Scanner input = new Scanner(System.in);

System.out.print("Enter amount of water in koligrams : ");
double M = input.nextDouble();
System.out.print("Enter the initial temperature : ");
double initialTemperature = input.nextDouble();
System.out.print("Enter the final temperature : ");
double finalTemperature = input.nextDouble();

double Q = M*(finalTemperature-initialTemperature)*4184;

System.out.println("The energy needed is "+Q);
input.close();
}
}