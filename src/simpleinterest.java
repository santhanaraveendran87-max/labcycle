import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: ");
        double p = sc.nextDouble();

        System.out.print("Rate: ");
        double r = sc.nextDouble();

        System.out.print("Time: ");
        double t = sc.nextDouble();

        double si = (p * r * t) / 100;
        double amount = p + si;

        System.out.println("Simple Interest = " + si);
        System.out.println("Amount = " + amount);
    }
}