package A_MawlanHasan.Extra;

import java.util.Scanner;

public class ValidNameAndPass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your user name:");
        String u=scan.nextLine();
        System.out.println("Enter your password:");
        String p=scan.nextLine();
        int attempt=1;

        while (!(u.equals("mawlan") && p.equals("123456"))){

            if (attempt>2){
                System.out.println("Your account is locked");
                System.exit(0);
            }
            System.out.println("Invalid, Please re-enter you user name and password");
            System.out.println("Enter your user name:");
            u=scan.nextLine();
            System.out.println("Enter your password:");
            p=scan.nextLine();
            attempt++;
        }
        System.out.println("Logged in");
    }
}
