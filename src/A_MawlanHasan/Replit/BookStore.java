package A_MawlanHasan.Replit;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();
        if(isPremiumCustomer=true && nbooksPurchased>=5){
            System.out.println(freeBooks+1);
        }else if(isPremiumCustomer==true && nbooksPurchased>=8){
            System.out.println(freeBooks+2);
        }else if(isPremiumCustomer=false && nbooksPurchased>=7){
            System.out.println(freeBooks+1);
        }else if(isPremiumCustomer=false && nbooksPurchased>=12){
            System.out.println(freeBooks+2);
        }
    }

}
