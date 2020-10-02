package A_MawlanHasan.Interview;
public class SameLetter {
    public static void main(String[] args) {
        System.out.println(sameLetter("banana", "banana"));
    }
    public static boolean sameLetter(String a, String b){
        char[] ch1=a.toCharArray();
        char[] ch2=b.toCharArray();

        String x="";
        String y="";
        for (char each:ch1){
            x+=each;
        }
        for (char each:ch2){
            y+=each;
        }
        return x.equals(y);
    }
}
