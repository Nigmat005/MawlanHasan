package A_MawlanHasan.Replit;

import java.util.Scanner;

public class Loop100To1_Odd_Hash_Contains {
    public static void main(String[] args) {
        for(int i=100; i>=0; i--){
            System.out.print(i);
        }
        System.out.println("=============");
        for (int i=0; i<49; i++){
            System.out.print("#");
        }
        System.out.println("==============");
        for (int i=11; i<=121; i++){
            if (i%2!=0){
                System.out.print(i);
            }
        }
        System.out.println("====================");
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();
        String sentence=scan.nextLine();
        if (sentence.contains(word)){
            System.out.println("Contains");
        }else{
            System.out.println("Does not contain");
        }
    }
}
