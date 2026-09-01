import java.io.*;
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        int count = 0;

        try {
            BufferedReader br =
                    new BufferedReader(new FileReader(fileName));

            while (br.readLine() != null) {
                count++;
            }

            br.close();

            System.out.println("Number of lines = " + count);

        } catch (IOException e) {
            System.out.println("Error: Unable to read file.");
        }
    }
}