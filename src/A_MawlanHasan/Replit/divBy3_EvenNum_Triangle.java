package A_MawlanHasan.Replit;

import java.util.Scanner;

public class divBy3_EvenNum_Triangle {
    public static void main(String[] args) {
        int i=1;
        while (i<=20){
            if (i%3==0)
                System.out.println(i);
                i++;

        }
        System.out.println("==========================");
        int k=80;
        while (k>=20){
            if (k%2==0);
                System.out.println(k);
                k--;
        }
        System.out.println("===================================");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int j=1; j<=n; j++){
            for (int m=1; m<=j; m++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
