package MawlanHasan.Self;
    import java.util.*;
 /*   1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
            oak ==> a
            javav ==> v
            - Single character, print that character 3 times
            # ==> ###
            q ==> qqq

            2. When word has even number of characters and:
            - 4 or more characters, print middle 2
            java ==> av
            apples ==> pl
            #$%^&* ==> %^
            - 2 characters, print those 2 characters twice
        @@ ==>@@@@
        $$ ==>$$$$
        hi ==> hihi                 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result = "";
        //YOUR CODE HERE
         /*   int i = word.length();
            if(i%2!=0){
                if(i>=3){
                    System.out.println(word.charAt(i/2));
                }else {
                    System.out.println(word+word+word);
                }
            }else{
                if(i>=4){
                    System.out.println(word.charAt(i/2-1)+""+(word.charAt(i/2)));
                }else{
                    System.out.println(word+word);
                }
            }
        }   */
        int ch=word.length();
        if(ch<5){
            result="Too short!";
        }else if(ch>5){
            result="Too long!";
        }else{
            result=result+word.charAt(4) + word.charAt(3) +
                    word.charAt(2) + word.charAt(1) + word.charAt(0);
        }
        System.out.println(result);
    }
}


