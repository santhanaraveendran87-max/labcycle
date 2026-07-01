import java.util.Scanner;

public class OperatorPrecedence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 10, b = 5, c = 2, d = 8, e = 4;

        int result = a + b * c - d / e;

        System.out.println("Result = " + result);
    }
}