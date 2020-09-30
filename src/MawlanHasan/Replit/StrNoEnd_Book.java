package MawlanHasan.Replit;

import java.util.Scanner;

public class StrNoEnd_Book {
    public static void main(String[] args) {
        String str="Mawlan";
        System.out.println(str.substring(0,str.length()-1));
        System.out.println("=================================");
        Scanner scan=new Scanner(System.in);
        boolean primium=scan.nextBoolean();
        int freebook=0;
        int numberofBookPurchased=scan.nextInt();
        if (primium){
            if (numberofBookPurchased>=5 && numberofBookPurchased<8){
                freebook+=1;
            }else if (numberofBookPurchased>=8){
                freebook+=2;
            }
        }else{
            if (numberofBookPurchased>=7 && numberofBookPurchased<12){
                freebook+=1;
            }else if (numberofBookPurchased>=12){
                freebook+=2;
            }
        }
        System.out.println(freebook);
    }
}
