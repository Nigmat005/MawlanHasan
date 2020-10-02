package A_MawlanHasan.Replit;

import java.util.Scanner;

public class BurgerChicken {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter you food name: ");
        String str=scan.nextLine();
        float f1=10;
        float f2=2;
        if (str.equals("Burger") || str.equals("Chicken")){
            System.out.println(f1);
        }
        if (str.equals("Soda")){
            System.out.println(f2);
        }
        System.out.println("================================");

    }
}
