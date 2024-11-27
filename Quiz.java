import java.util.Scanner;
public class Quiz{
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int score=0;
   char input;
 
  System.out.println("Capital of Bangaladesh ?");
  System.out.println("A.Dhaka   B.Rajshahi   C.Sylhet");
   input = sc.next().toUpperCase().charAt(0);
  if( input=='A')
    { 
      System.out.println("Correct");
      score+=5;
     }
    else
       { 
         System.out.println("Incorrect");
          score-=1;
        }
System.out.println("What is the derivative of sin(x) with respect to x ?");
  System.out.println("A. cos(x)   B. -cos(x)   C -sin(x) ");
  input = sc.next().toUpperCase().charAt(0);
  if( input=='A')
    { 
      System.out.println("Correct");
      score+=5;
     }
    else
       { 
         System.out.println("Incorrect");
          score-=1;
        }

System.out.println("What is the speed of light?");
  System.out.println("A(3*10^5 m/s)   B(3*10^8 m/s)   C(3*10^10 m/s");
  input = sc.next().toUpperCase().charAt(0);
  if( input=='B')
    { 
      System.out.println("Correct");
      score+=5;
     }
    else
       { 
         System.out.println("Incorrect");
          score-=1;
        }

System.out.println("What is the capital of Japan?");
  System.out.println("A.tokyo  B.Osaka C.Beijing");
  input = sc.next().toUpperCase().charAt(0);
  if( input=='A')
    { 
      System.out.println("Correct");
      score+=5;
     }
    else
       { 
         System.out.println("Incorrect");
          score-=1;
        }

System.out.println("Who is the father of computer?");
  System.out.println("A.Charles Babbage   B.Alan Turing  C.John von Neumann");
  input = sc.next().toUpperCase().charAt(0);
  if( input=='A')
    { 
      System.out.println("Correct");
      score+=5;
     }
    else
       { 
         System.out.println("Incorrect");
          score-=1;
        }
System.out.println("Total marks : "+score);
sc.close();
  }

}
    
    
    