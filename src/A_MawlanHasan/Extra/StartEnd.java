package A_MawlanHasan.Extra;

import java.util.Scanner;

public class StartEnd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scan.next();
        char ch1=word.charAt(0);
        char ch2=word.charAt(word.length()-1);
        boolean upper=ch1>='A' && ch1<='Z';
        boolean lower=ch2>='a' && ch2<='z';
        System.out.println(upper&&lower);
    }
}
