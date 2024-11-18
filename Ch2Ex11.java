import java.util.Scanner;
public class Ch2Ex11
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of years : ");
int year = input.nextInt();

 int currentPopulation = 312032486;
int birth , death , migrant;

int totalSecond = year*365*24*60*60;

birth = totalSecond/7;
death = totalSecond/13;
migrant = totalSecond/45;
int totalpopulation =  (currentPopulation+birth+migrant) - death;

System.out.println("The population in "+year+" years is "+totalpopulation);
input.close();
}
}
