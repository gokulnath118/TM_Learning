// 2) Stock Quantity Checker

import java.util.Scanner;
public class Task2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.print("Enter Stock Amount: ");
        int stockPrice=s.nextInt();

        if (stockPrice<50){
            System.out.println("Low");
        }
        else if (stockPrice>50 && stockPrice<200){
            System.out.println("Medium");
        }
        else{
            System.out.println("High");
        }

        for(int i=1;i<=10;i+=1){
            if(i==5){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
        int total=0;
        while(true){
            total+=10;
            if (total>100){
                break;
            }
            else{
                System.out.println("Current Total"+ total);
            }
        }
        s.close();
    }
}