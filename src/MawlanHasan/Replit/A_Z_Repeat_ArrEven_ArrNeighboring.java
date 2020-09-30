package MawlanHasan.Replit;

import java.util.Scanner;

public class A_Z_Repeat_ArrEven_ArrNeighboring {
    public static void main(String[] args) {
        Scanner scan0=new Scanner(System.in);
        char ch=scan0.next().charAt(0);
        char ch2=scan0.next().charAt(0);
        for (int i=ch; i<=ch2; i++){
            System.out.println(""+(char)i);
        }
        System.out.println("+============================");
        Scanner scan2 = new Scanner(System.in);
        String word = scan2.next();
        String separator = scan2.next();
        int count1 = scan2.nextInt();
        String result="";
        for(int i=1; i<=count1-1; i++){
            result+=word+separator;
        }
        result+=word;
        System.out.println(result);
        System.out.println("=============================");
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0 ; i<=9 ; i ++){
            nums[i] = input.nextInt();
        }
        int count=0;
        for (int i=0; i<=9; i++){
            if (nums[i]%2==0){
                count++;
            }
        }
        System.out.println("================================");
        Scanner scan = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = scan.nextLine();
        }
        for (int i=0; i<=arr.length-3; i++){
            System.out.println(arr[i]+arr[i+1]+arr[i+2]);
        }
    }

}
