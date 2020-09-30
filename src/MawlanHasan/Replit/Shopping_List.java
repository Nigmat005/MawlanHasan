package MawlanHasan.Replit;
import java.util.Scanner;
public class Shopping_List {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println ("Enter Item1, count and its price:");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();

        System.out.println ("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();

        System.out.println ("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();



        String report = "";
        double totalPrice = 0;


        if (count2 == 0){
            report = "Item1: " + item1 + " Price: " + price1 + ", Item3: " + item3 + " Price: " + price3;
            totalPrice = price1 + price3;
        }else if (count3 == 0){
            report = "Item1: " + item1 + " Price: " + price1 + ", Item2: " + item2 + " Price: " + price2;
            totalPrice = price1 + price2;
        }else{
            report = "Item2: " + item2 + " Price: " + price2 + ", Item3: " + item3 + " Price: " + price3;
            totalPrice = price2 + price3;
        }
        System.out.println(report);
        System.out.println("Total price: " + totalPrice);
    }
    }

