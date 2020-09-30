package MawlanHasan.Replit;
/*      2. write a program that asks the user enter the:
        1. company name
        2. first name
        3. last name
        4. Job title
        5. salary       */

import java.util.Scanner;
public class personal_Info {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter you company name: ");
        String companyName=scan.next();
        System.out.println("Enter you first name: ");
        String firstName=scan.next();
        System.out.println("Enter you last name: ");
        String lastName=scan.next();
        System.out.println("Enter your job title: ");
        String jobTitle=scan.nextLine();
        scan.nextLine();
        System.out.println("Enter your salary");
        int salary=scan.nextInt();
    }
}
