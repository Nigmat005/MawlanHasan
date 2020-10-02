package A_MawlanHasan.Replit;
/*      3. write a program that asks the user to enter:
        1. building number
        2. street name (if it is more than 1 word)
        3. road name
        4. city name
        5. state
        6. zipcode      */

import java.util.Scanner;
public class Apt_Address {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter building number: ");
        int buildingNum=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter street name: ");
        String streetName=scan.nextLine();
        System.out.println("Enter road name: ");
        String roadName=scan.nextLine();
        System.out.println("Enter city name: ");
        String cityName=scan.next();
        System.out.println("Enter state name: ");
        String stateName=scan.next();
        System.out.println("Enter zip code: ");
        int zipCode=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your full name: ");
        String fullName=scan.nextLine();
        System.out.println("\nShip to: "+fullName+"\n"+buildingNum+" "+streetName+"\n"+cityName+", "+stateName+" "+zipCode);
    }
}
