package A_MawlanHasan.Interview;
public class FindUnique {
    public static void main(String[] args) {
        System.out.println(uniques("banana"));
    }
    public static String uniques(String str) {
        String result = "";
        for (int k = 0; k <= str.length() - 1; k++) {
            int count = 0;
            char ch = str.charAt(k);
            for (int i = 0; i <= str.length() - 1; i++) {
                char each = str.charAt(i);
                if (each == ch) {
                    count++;
                }
            }
            if (count == 1) {
                result += ch;
            }

        }
        return result;
    }

}
