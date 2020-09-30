package MawlanHasan.Replit;

import java.util.Scanner;

public class LoopSumNum_multiSumNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
        } else {
            System.out.println("Invalid");
        }
        System.out.println(sum);
        System.out.println("======================");
        Scanner scan1 = new Scanner(System.in);
        int num1 = scan.nextInt();
        int sum1 = 1;
        if (num1 > 0) {
            for (int i = 1; i <= num1; i++) {
                sum1 *= i;
            }
            System.out.println(sum1);
        }
    }
}