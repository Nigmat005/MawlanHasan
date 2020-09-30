package MawlanHasan.Replit;
import java.util.Scanner;
/*       1. write a java program that can convert any given numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
          MUST use Scanner and nested IF    */
public class numTOword {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number= scan.nextInt();
        String result="";
        if(number>=0 && number<=9){
            if (number==0){
                result = "Zero";
            }else if (number==1){
                result="One";
            }else if(number==2){
                result="Two";
            }else if (number==3){
                result="Three";
            }else if(number==4){
                result="Four";
            }else if(number==5){
                result="Five";
            }else if(number==6) {
                result="Six";
            }else if(number==7){
                result="Seven";
            }else  if(number==8){
                result="Eight";
            }else {
                result="Nine";
            }
        }else{
            result="You entered invalid number";
        }
        System.out.println(result);

    }
}
