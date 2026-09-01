import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int[] numbers = {a, b};

            System.out.println("Division = " + (numbers[0] / numbers[1]));

            System.out.println("Third element = " + numbers[2]);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index does not exist.");

        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        }
    }
}