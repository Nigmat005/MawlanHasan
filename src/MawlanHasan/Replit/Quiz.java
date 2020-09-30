package MawlanHasan.Replit;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("what is the most beatiful place on the earth? " );
        System.out.println("a)Macca" );
        System.out.println("b)New York" );
        System.out.println("c)Khotan" );
        String answer = s.nextLine();
        if (answer.equals("Macca")){
            System.out.println("a is correct");
        }else if(answer.equals("New York")){
            System.out.println("b  is not correct");
        }else{
            System.out.println("c is wrong");
        }
    }
}
