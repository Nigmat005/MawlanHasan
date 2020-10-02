package A_MawlanHasan.Replit;

public class HalfTwice_Longest {
    public static void main(String[] args) {
        String str = "MawlanKhotai";
        String half=str.substring(0,str.length()/2);
        System.out.println(half.concat(half));

        System.out.println();
        System.out.println("================================================================");
        String str1= "A_MawlanHasan";
        int num=str.length();
        int num1=str1.length();
        if (num>num1){
            System.out.println(str+str.length());
        }else{
            System.out.println(str1+str1.length());
        }


    }
}
