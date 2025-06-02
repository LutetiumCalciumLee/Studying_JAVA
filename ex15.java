// ArithmeticException Caused by Division by Zero
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();
            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            try {
                System.out.println("When you divide " + dividend + " by " 
                    + divisor + ", the quotient is " + (dividend / divisor) + ".");
                break; // Exit the loop if division is successful
            } catch (ArithmeticException e) { // Code to handle ArithmeticException
                System.out.println("You cannot divide by zero! Please enter the numbers again.");
            }
        }
        scanner.close();
    }
}