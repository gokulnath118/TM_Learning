import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Zero Divisional Error");
            return 0;
        } finally {
            System.out.println("Division operation completed.");
        }
    }

    public static void openFile(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("Error: File not found at " + path);
        }
        System.out.println("File found! Reading contents...");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("20 / 10 = " + divide(20, 10));
        System.out.println("7 / 0 = " + divide(7, 0));

        try {
            openFile("hello.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            openFile("hai.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
