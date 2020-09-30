package MawlanHasan.Replit;
/*    1. write a program that asks the user enter his car info:
        brand
        model
        year
        color
        mileage
        price
        ex: output format should be:
        2012 Toyota Corolla white, 120000 miles, 12000 dollars      */

import java.util.Scanner;
public class car_info {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your car's manufactured date: ");
        int date=scan.nextInt();

        System.out.println("Enter car brand: ");
        String brand=scan.next();

        System.out.println("Enter car model: ");
        String model=scan.next();

        System.out.println("Enter car color: ");
        String color=scan.next();

        System.out.println("Enter mileage: ");
        int mileage=scan.nextInt();

        System.out.println("Enter the price: ");
        int price=scan.nextInt();

        System.out.println(date+" "+brand+" "+model+" "+color+", "+mileage+"miles, "+price+"dollars ");
    }
}
