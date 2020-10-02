package A_MawlanHasan.ReplitReview;
import java.util.Arrays;
/*
Given a String array words, iterate through each word and print first and last letter of each element in the format below.
Example:
words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]
 */
public class PrintFirstLastChar {
    public static void main(String[] args) {
        String[] str = {"hello", "why", "by", "apple", "note"};
        String[] arr = new String[str.length];
        for (int i = 0; i <= str.length - 1; i++) {
            arr[i]=(str[i].charAt(0)+""+str[i].charAt(str[i].length()-1));
        }
        System.out.println(Arrays.toString(arr));
    }
}
