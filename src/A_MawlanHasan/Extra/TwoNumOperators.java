package A_MawlanHasan.Extra;

import java.util.Scanner;

public class TwoNumOperators {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true){
            System.out.println("Enter 2 numbers");
            int num1=scan.nextInt();
            int num2=scan.nextInt();
            System.out.println("Enter math operator");
            char o=scan.next().charAt(0);

            int result=(o=='+')? num1+num2 :(o=='-')? num1-num2 :(o=='*')? num1*num2 :(o=='/')? num1/num2 :(o=='%')? num1%num2 :0;
            System.out.println(result);
            System.out.println("Do you want to continue?");
            String s=scan.next().toLowerCase();

            while (!(s.equals("yes") || s.equals("no"))){
                System.out.println("Please, enter yes or no");
                s=scan.next().toLowerCase();
            }
            if (s.equals("no")){
                break;
            }

        }

    }
}
