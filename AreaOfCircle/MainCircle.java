import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.print("Enter radius of the circle : ");
       double radius = input.nextDouble();
       Circle circle = new Circle (radius);

       System.out.println("Area of the circle (using constructor) : "+circle.AreaOfCircle());

     System.out.print("Enter new radius for the circle : ");
     radius = input.nextDouble();
     circle.setterRadius(radius);

    System.out.println("Area of the circle (using setter ) : "+circle.AreaOfCircle());

  input.close();
  }
}
       