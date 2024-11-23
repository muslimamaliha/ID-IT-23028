public class Circle {
   private double radius;

public Circle(double radius) {    //constructor
       this.radius = radius;
   }

public void setterRadius(double radius) {
      this.radius = radius;
  }

public double getterRadius() {
    return radius;
  }

public double AreaOfCircle() {
   return Math.PI *radius*radius;

   }
}