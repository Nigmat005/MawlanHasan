package MawlanHasan.Replit;

import java.util.Scanner;

public class zombie {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int inhabitants=scan.nextInt();
        int day=0;
        while(inhabitants>0){
            System.out.println("day "+day+" "+" "+inhabitants);
            inhabitants/=2;
            day++;
        }
        System.out.println("Rip");
    }
}
