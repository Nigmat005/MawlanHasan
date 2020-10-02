package A_MawlanHasan.Replit;

import java.util.Scanner;
/*
If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.

Otherwise print "invalid".

 */
public class Mddile3_EmailCheck_BlackJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int i=word.length();
        if (i%2==0 || i>5){
            System.out.println("Invalid");
        }else{
            int midnum=i/2;
            System.out.println(word.substring(midnum-1,midnum+2));
        }
        System.out.println("======================================");
        Scanner scan2=new Scanner(System.in);
        String email=scan.nextLine();
        if (email.contains("Mawlan" ) && email.contains("Project")){
            System.out.println("Read");
        }else{
            System.out.println("Don't read");
        }
        System.out.println("==================================================");
        /*
        1) if the card total is bigger then 21 the player busts.
2)if the house score is bigger then the player, the player loses .
3)if the player score is equal to the house then thers a draw.
4)if the player score is bigger then the house the player wins.

player and house scores are represented by  player and house int variables.
         */
        Scanner s = new Scanner(System.in);
        int house = s.nextInt();
        int player = s.nextInt();
        if (player>21){
            System.out.println("Busted");
        }else if(house>player){
            System.out.println("Player lost");
        }else if (player>house){
            System.out.println("Player win");
        }else{
            System.out.println("Draw one card");
        }

    }
}
