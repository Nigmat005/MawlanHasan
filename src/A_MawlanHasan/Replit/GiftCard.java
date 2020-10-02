package A_MawlanHasan.Replit;
import java.util.Scanner;
public class GiftCard {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name ofyour iteam");
        String iteam = scan.nextLine();
        int balance = 100;
        if (iteam.equals("Smartphone") || iteam.equals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (iteam.equals("Charger")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 15;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (iteam.equals("USB cable")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 10;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (iteam.equals("Headphones")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 30;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (iteam.equals("Pants")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 50;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (iteam.equals("Hat")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 25;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (iteam.equals("Socks")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 5;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (iteam.equals("Blanket")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 60;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (iteam.equals("Pillow")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 40;
            System.out.println("Your current balance is: " + balance + "$");
        } else {
            System.out.println("Invalid item!");
        }
    }
}
