package MawlanHasan.Replit;

import java.util.Scanner;
public class SwichChar_FirstTwoChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your command: ");
        char ch=scan.next().charAt(0);
        switch (ch) {
            case 'Y':
                System.out.println("Yes");
                break;
            case 'N':
                System.out.println("No");
                break;
            default:
                System.out.println("What?");
        }
        System.out.println("=========================");
        String str="Mawlan";
        String firstTwo=str.substring(0,2);
        System.out.println(firstTwo);

    }
}
