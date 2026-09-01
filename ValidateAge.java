import java.util.Scanner;

public class ValidateAge {

    static void checkAge(int age) {

        if (age < 18) {
            throw new IllegalArgumentException(
                    "Age must be 18 or above.");
        }

        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}