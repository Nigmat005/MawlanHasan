package A_MawlanHasan.Replit;

import java.util.Scanner;

public class SMSmessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;
        int o1 = message.indexOf("<");
        int c1 = message.indexOf("<");
        int o2 = message.indexOf("[");
        int c2 = message.indexOf("]");
        int o3 = message.indexOf("{");
        int c3 = message.indexOf("}");
        sender=message.substring(o1,c1);
        phoneNumber=message.substring(o2,c2);
        messageBody=message.substring(o3,c3);

        System.out.println(sender);
        System.out.println(phoneNumber);
        System.out.println(messageBody);

    }
}
