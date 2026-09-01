import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidIntegerInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            System.out.println("You entered: " + number);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }
    }
}