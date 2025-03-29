public class Task3 {
    public static void main(String[] args) {
        int num1 = 10; 
        int num2 = 20; 

        System.out.println("num1 & num2: " + Integer.toBinaryString(num1 & num2));
        System.out.println("num1 | num2: " + Integer.toBinaryString(num1 | num2));
        System.out.println("num1 ^ num2: " + Integer.toBinaryString(num1 ^ num2));
        System.out.println("num1 << 3: " + Integer.toBinaryString(num1 << 3));
        System.out.println("num2 >> 3: " + Integer.toBinaryString(num2 >> 3));

        boolean a = false, b = true;

        if (a && b) {
            System.out.println("Logical AND: Both are true");
        } else {
            System.out.println("Logical AND: Not both are true");
        }

        if (a || b) {
            System.out.println("Logical OR: One is true");
        }

        if ((num1 & num2) > 0) {
            System.out.println("Bitwise AND: Some bits are common");
        }

        if ((num1 | num2) > 0) {
            System.out.println("Bitwise OR: At least one bit is set");
        }
    }
}
