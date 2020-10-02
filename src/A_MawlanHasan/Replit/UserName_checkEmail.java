package A_MawlanHasan.Replit;

import java.util.Scanner;

public class UserName_checkEmail {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name=scan.nextLine();
        if (name.equalsIgnoreCase("Mawlan" )|| (name.equalsIgnoreCase("Hasan"))){
            System.out.println("User found");
        }else{
            System.out.println("Who are you? ");
        }
        System.out.println("=================================================================================");
        String email="Mawlan";
        if (email.contains("Mawlan")){
            System.out.println("Read this email");
        }else{
            System.out.println("Don't read it");
        }
    }
}
