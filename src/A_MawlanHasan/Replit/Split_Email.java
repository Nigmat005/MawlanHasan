package A_MawlanHasan.Replit;

import java.util.Scanner;

public class Split_Email {
    public static void main(String[] args) {
        Scanner scan0= new Scanner(System.in);
        String email0 = scan0.next();
        if (!email0.contains("_")) {
            System.out.println(email0);
        } else {
            String firstName0;
            String lastName0;
            int under0;
            int at0;
            under0 = email0.indexOf("_");
            at0 = email0.indexOf("@");
            firstName0 = email0.substring(0, under0);
            lastName0 = email0.substring(under0 + 1, at0);
            System.out.println(lastName0+"_"+firstName0+"@gmail.com");
        }
        System.out.println("======================================");
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String fistName;
        String lastName;
        String domain;
        String topDomain;
        int under;
        int at;
        int dot;
        under=email.indexOf("_");
        at=email.indexOf("@");
        dot=email.indexOf(".");
        fistName=email.substring(0,under+1);
        lastName=email.substring(under+1,at);
        domain=email.substring(at+1,dot);
        topDomain=email.substring(dot+1);
        System.out.println(fistName);
        System.out.println(lastName);
        System.out.println(domain);
        System.out.println(topDomain);

        System.out.println("============================" );
        Scanner input = new Scanner(System.in);
        String email1 = input.nextLine();
        String arr[]=email.split("@");
        if(arr.length==2){
            System.out.println("Email id: "+arr[0] );
            System.out.println("Email domain: "+arr[1] );
        }else{
            System.out.println("invalid email");
        }
    }

}
