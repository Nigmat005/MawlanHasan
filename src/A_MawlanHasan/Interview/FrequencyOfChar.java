package A_MawlanHasan.Interview;
public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "BANANA";
        System.out.println(frequncy(str));

    }
    public static String frequncy(String str) {

        String nonDup = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            String s = str.charAt(i) + "";
            if (!nonDup.contains(str.charAt(i) + "")) {
                nonDup += s; //ban
            }
        }

        String result = ""; //b1a3n2

        for (int j = 0; j <= nonDup.length() - 1; j++) {
            char ch = nonDup.charAt(j);
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                char each = str.charAt(i);
                if (each == ch) {
                    count++;
                }
            }
            result += "" + ch + count;

        }
        return result;
    }

}
