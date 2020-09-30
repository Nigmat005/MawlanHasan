package MawlanHasan.Replit;

public class String_Char {
    public static void main(String[] args) {
        String ta="A";
        ta=ta.concat("B");
        String tb="C";
        ta=ta+tb;
        ta.replace('C','D');
        ta=ta+tb;
        System.out.println(ta);
        String s1="a";
        String s2="b";
        System.out.println("s1==s2 is:"+s1==s2);

        String s=" ";
        s.trim();
        boolean a=s.isEmpty();
        System.out.println(a);
    }
}
