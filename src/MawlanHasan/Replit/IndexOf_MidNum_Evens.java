package MawlanHasan.Replit;

import java.util.Scanner;

public class IndexOf_MidNum_Evens {
    public static void main(String[] args) {
        String name="foo bar";
        int b=name.indexOf("b");
        int f=name.indexOf("foo");
        System.out.println(b);
        System.out.println(f);
        System.out.println("====================");
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
        if(num1>num2 && num1<num3){
            System.out.println(num1+" is middle num");
        }else if(num2>num1 && num2<num3){
            System.out.println(num2+"is middle num");
        }else{
            System.out.println(num3+" is middle num");
        }
        System.out.println("===================================");
        for (int i=0; i<=100; i++){
            if (i%2==0)
            System.out.print(i);
        }
    }
}
