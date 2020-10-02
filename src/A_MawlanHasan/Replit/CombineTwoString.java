package A_MawlanHasan.Replit;
/*      1. Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
        Input:
        one
        eight
        Output:
        oneight     */

public class CombineTwoString {
    public static void main(String[] args) {
 /*       Scanner scan=new Scanner(System.in);
        String s1=scan.next();
        String s2=scan.next();

        char ch1=s1.charAt(s1.length()-1);
        char ch2=s2.charAt(0); // first char from s2
        if (ch1==ch2){
            System.out.println(s1+s2.substring(1)); //excluding first character of the second string
        }else{
            System.out.println(s1+s2);

        }   */

        // second way to do it
        String str1="one";
        String str2="eight";
        String s3=str1.substring(str1.length()-1 );
                                    //  substring(2) ==e
        String s4=str2.substring(0,1); //    e==    ending index is excluded
        if (s3.equals(s4)){
            System.out.println(str1+str2.substring(1));
        }else{
            System.out.println(str1+str2);
        }










    }
}
