package A_MawlanHasan.Replit;

import java.util.Scanner;

public class CarDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        for(int i = 0; i<=word.length()-1;i++) {
            String ch = "" + word.charAt(i);
            if (ch.equalsIgnoreCase("c")) {
                if(word.substring(i, (i+3)).equalsIgnoreCase("cat")){
                    countOfCats++;
                }
            }else if(ch.equalsIgnoreCase("d")){
                if(word.substring(i,(i+3)).equalsIgnoreCase("dog")){
                    countOfDogs++;
                }
            }
        }
        System.out.println(countOfDogs==countOfCats);


    }
}
