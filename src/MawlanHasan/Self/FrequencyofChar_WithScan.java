package MawlanHasan.Self;

import java.util.Scanner;

public class FrequencyofChar_WithScan {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        char ch=scan.next().charAt(0);
        int count=0;
        for (int i=0; i<=str.length()-1; i++){
            char each=str.charAt(i);
            if (ch==each){
                count++;
            }
        }
        System.out.println(count);
    }
}
