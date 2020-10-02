package A_MawlanHasan.Replit;
import java.util.Scanner;
public class chart_length {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your favorite quote: ");
        String str=scan.nextLine();

        int length=str.length();
        System.out.println(length);


        int lastIndexNum=str.length()-1;
        System.out.println(lastIndexNum);

        char lastCharacter=str.charAt(lastIndexNum);
        System.out.println(lastCharacter);
    }
}
