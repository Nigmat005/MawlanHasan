package MawlanHasan.Replit;

import java.util.Scanner;

public class LoopX {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();
        for (int i=1; i<=num; i++){
            for (int k=1; k<=3; k++){
                System.out.print("x");
            }
            System.out.println();
        }
        System.out.println("=====================");
        System.out.println("Enter a number");
        int num1=scan.nextInt();
        String row="xxx";
        String inner="x x";
        String result="";
        for (int i=1; i<=num1; i++){
            result+="x x"+"\n";
        }
        System.out.println(row+"\n"+result+row);
    }
}
