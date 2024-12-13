import java.util.Scanner;
public class GCD_LCM {
       public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
  
        System.out.print("Enter two number a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int A = a ;
        int B = b ;
           
         do {
                  int temp = b ;
                   b = a % b ;
                   a = temp ;             // gcd = a
                 } while ( b != 0 ) ;

           // LCM
            int gcd = a ;
            int lcm = ( A*B ) / gcd ;  
          
            System.out.println("GCD of a , b : "+a+" and LCM : "+lcm);
         sc.close();
       }
}