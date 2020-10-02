package A_MawlanHasan.SomethingNew;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(reverseMe("cybertek"));
    }

    static String reverseMe(String s) {
        if (s.length() == 0) {
            return "";
        } else {
            return reverseMe(s.substring(1))+s.charAt(0);
        }

    }
}
