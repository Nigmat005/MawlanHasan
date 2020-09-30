package MawlanHasan.Replit;

public class FirstLastMiddle {
    public static void main(String[] args) {
        String str="MawlanKhotai";
        System.out.println(str.substring(0,1));
        System.out.println(str.charAt(str.length()-1));
        int i=str.length();
        if (i%2!=0){
            System.out.println(str.charAt(i/2));
        }else if(i%2==0){
            System.out.println(str.charAt(i/2-1)+(str.charAt(i/2)));
        }
    }
}
