import java.util.HashMap;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Double> productPrices = new HashMap<>();

        // Adding predefined product prices
        productPrices.put("Biscuit", 10.09);
        productPrices.put("Jam", 35.99);
        productPrices.put("Oil", 4.89);

        while (true) {
            System.out.println("=== Multi-Option Utility Tool ===");
            System.out.println("press 1 to Check Product Price");
            System.out.println("press 2 to Calculate Sales Total");
            System.out.println("press 3 to Convert Kilometers to Miles");
            System.out.println("press 4 to Exit");
            System.out.print("Enter your choice: ");
            
            if (!s.hasNextInt()) {
                System.out.println("Please enter a number between 1 and 4.");
                s.next();
                continue;
            }
            int choice = s.nextInt();
            s.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter product name (Biscuit, Jam, Oil): ");
                    String product = s.nextLine().trim();

                    if (productPrices.containsKey(product)) {
                        System.out.println("Price of " + product + ": Rs " + productPrices.get(product));
                    } else {
                        System.out.println("Product not found! Please enter a valid product.");
                    }
                    break;

                case 2:
                    double totalSales = 0;
                    while (true) {
                        System.out.print("Enter sale amount (0 to finish): ");
                        double sale = s.nextDouble();
                        if (sale == 0) {
                            break;
                        } 
                        else if(sale>0){
                            totalSales += sale;
                        }
                        else {
                            System.out.println("Invalid input! Please enter a numeric value.");
                            s.next(); 
                        }
                    }
                    System.out.println("Total sales for the day: Rs " + totalSales);
                    break;

                case 3:
                    System.out.print("Enter distance in kilometers: ");
                    if (s.hasNextDouble()) {
                        double km = s.nextDouble();
                        double miles = km * 0.621371;
                        System.out.printf("%.2f km is equal to %.2f miles\n", km, miles);
                    } else {
                        System.out.println("Invalid input! Please enter a numeric value.");
                        s.next();
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    s.close();
                    return;

                default:
                    System.out.println("Please enter a number between 1 and 4.");
            }
        }
    }
}
