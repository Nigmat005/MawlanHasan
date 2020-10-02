package A_MawlanHasan.Extra;
import java.util.Scanner;
public class Extra_Practice {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your Name:");
            String name = sc.nextLine();

            System.out.println("Enter your Gender:");
            char gender = sc.next().charAt(0);

            System.out.println("Enter your Age:");
            int age = sc.nextInt();

            System.out.print("Enter your Phone Number:+1 ");
            long phoneNo = sc.nextLong();

            System.out.println("Enter your GPA:");
            double GPA = sc.nextDouble();
            System.out.println("                                                                                                                                        ");
            System.out.println("Please confirm your personal information");
            System.out.println("                                                                                                                                        ");
            System.out.println("Name: " + name);
            System.out.println("Gender: " + gender);
            System.out.println("Age: " + age);
            System.out.println("Mobile Number: +1 " + phoneNo);
            System.out.println("GPA: " + GPA);
            System.out.println("                                                                                                                                        ");
            System.out.println("                       ______            ______                                                                                                   ");
            System.out.println("                      | Edit |          | Save |                                                                ");
            System.out.println("                      |______|          |______|                                                                                                                      ");
    }
}
