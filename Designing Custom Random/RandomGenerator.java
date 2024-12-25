import java.util.Scanner;

public class RandomGenerator {

       private static int initial = 12345;

    // Constants  the Linear Congruential Generator (LCG) formula
    private static final int a = 1664525;  // Multiplier
    private static final int c = 1013904223;  // Increment
    private static final int m = 10000;  // Module

    // Generate a random integer between min and max using LCG formula

    public static int generateRandomInt(int min, int max) {
        initial = Math.abs( (a * initial + c) % m );
     return min + (initial % (max - min + 1)); 
    }

    //  random double 
    public static double generateRandomDouble(double min, double max) {
        initial = Math.abs( (a * initial + c) % m);  
        return min + ((double) initial / m) * (max - min); 
    }

    // random float 
    public static float generateRandomFloat(float min, float max) {
        initial = Math.abs((a * initial + c) % m); 
        return min + ((float) initial / m) * (max - min); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input range for generating random numbers
        System.out.print("Enter the minimum value: ");
        int min = scanner.nextInt();
        
        System.out.print("Enter the maximum value: ");
        int max = scanner.nextInt();

               if (min > max) {
            System.out.println("Invalid range! Minimum should be less than or equal to maximum.");
        } else {
            // Test cases with user input for range
            System.out.println("Random Integer (" + min + " to " + max + "): " + generateRandomInt(min, max));
            System.out.println("Random Double (between " + min + " and " + max + "): " + generateRandomDouble(min, max));
            System.out.println("Random Float (between " + min + " and " + max + "): " + generateRandomFloat(min, max));
        }

        scanner.close();
    }
}
