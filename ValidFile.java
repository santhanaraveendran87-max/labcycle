import java.io.*;
import java.util.Scanner;

public class ValidFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        File file = null;

        while (true) {

            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();

            file = new File(fileName);

            if (file.exists()) {
                break;
            }

            System.out.println("File not found. Try again.");
        }

        try {
            BufferedReader br =
                    new BufferedReader(new FileReader(file));

            String line;
            int count = 0;

            System.out.println("\nFirst five lines:");

            while ((line = br.readLine()) != null && count < 5) {
                System.out.println(line);
                count++;
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}