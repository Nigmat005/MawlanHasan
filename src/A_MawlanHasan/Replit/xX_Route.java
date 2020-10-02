package A_MawlanHasan.Replit;

import java.util.Scanner;

public class xX_Route {
    public static void main(String[] args) {
        String str="apple";
        if (str.startsWith("x") || str.startsWith("X") || str.startsWith("x") || str.endsWith("X")){
            System.out.println(str.substring(1,str.length()-1));
        }else{
            System.out.println(str);
        }
        System.out.println("==============================================================================");
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        String result ="";
        if (start.equals("a")){
        if (end.equals("b")){
            result="right"+end+"found";
        }else if (end.equals("c")){
            result="right"+"down"+end+"found";
        }else if (end.equals("d")){
            result="right"+"down"+"left"+end+"found";
        }else{
            result=end+"found";
        }
        }
        if (start.equals("B") ){
            if(end.equals("C")){
                result = "down: " + end + " found";
            }else if (end.equals("D")){
                result = "down > left: " + end +" found";
            }else if (end.equals("A")){
                result = "down > left > up: " + end + " found";
            }else{
                result = end + " found";
            }
        }
        if (start.equals("C") ){
            if(end.equals("D")){
                result = "left: " + end + " found";
            }else if (end.equals("A")){
                result = "left > up: " + end +" found";
            }else if (end.equals("B")){
                result = "left > up > right: " + end + " found";
            }else{
                result = end + " found";
            }
        }
        if (start.equals("D") ){
            if(end.equals("A")){
                result = "up: " + end + " found";
            }else if (end.equals("B")){
                result = "up > right: " + end +" found";
            }else if (end.equals("C")){
                result = "up > right > down: " + end + " found";
            }else{
                result = end + " found";
            }
        }
        System.out.println(result);
    }
}


