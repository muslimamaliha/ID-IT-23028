import java.io.*; 
import java.util.Scanner;

public class MalihaForKids {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Welcome to the Math Game!");
        System.out.println("Solve the problems provided in the input file.");

        try {
            File inputFile = new File("input.txt");
            File outputFile = new File("output.txt");

            if (!inputFile.exists()) {
                System.out.println("Input file not found! Please create a file named 'input.txt' with math problems.");
                return; 
            }

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            int correctCount = 0; 
            int wrongCount = 0; 

            while ((line = reader.readLine()) != null) {
                System.out.println("Solve: " + line); 

                int correctAnswer = evaluateExpression(line); 

                System.out.print("Your answer: ");
                int userAnswer = scanner.nextInt(); 

                if (userAnswer == correctAnswer) {
                    writer.write(line + " = " + userAnswer + " (Correct)\n"); 
                    correctCount++; 
                } else {
                    writer.write(line + " = " + userAnswer + " (Incorrect, Correct Answer: " + correctAnswer + ")\n"); 
                    wrongCount++; 
                }
            }

            writer.write("Total Correct: " + correctCount + "\n");
            writer.write("Total Incorrect: " + wrongCount + "\n");
            writer.write("Total Points: " + (correctCount) + "\n");

            writer.close();
            reader.close();

            System.out.println("Game Over! Check 'output.txt' for your results.");

        } catch (IOException e) {
            System.out.println("Error while handling files: " + e.getMessage()); 
        }

        scanner.close();
    }
    public static int evaluateExpression(String expression) {
        String[] parts = expression.split(" "); 
        int num1 = Integer.parseInt(parts[0]); 
        int num2 = Integer.parseInt(parts[2]); 
        String operator = parts[1]; 

        if (operator.equals("+")) {
            return num1 + num2; 
        } else if (operator.equals("-")) {
            return num1 - num2; 
        } else {
            return 0; 
        }
    }
}
