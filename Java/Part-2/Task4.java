import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();
        products.add("Samsung Galaxy S23");
        products.add("iPhone 14 Pro");
        products.add("OnePlus 11");
        products.add("Google Pixel 7");
        products.add("iPhone 14 Pro");
        products.add("Samsung Galaxy S23");

        System.out.println("Original Product List: " + products);

        Set<String> uniqueProducts = new LinkedHashSet<>(products);

        System.out.println("Unique Product List: " + uniqueProducts);

        uniqueProducts.add("Xiaomi 13 Pro");
        uniqueProducts.remove("OnePlus 11");

        System.out.println("Updated Product List: " + uniqueProducts);
        System.out.println("Total Unique Products: " + uniqueProducts.size());
        System.out.println("Contains Google Pixel 7? " + uniqueProducts.contains("Google Pixel 7"));
    }
}
