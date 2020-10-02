package A_MawlanHasan.Replit;

import java.util.Scanner;

public class ArrMax_PrintArr_ArrSum {
    public static void main(String[] args) {
        int[] nums={5,12,66,-1,56,10,87,99};
        int max=nums[0];
        for (int i=0; i<=nums.length-1; i++){
            if (nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println(max);
        System.out.println("========================");
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 8 items
        //and print two items at a time in 4 line
        //write your code below
     for (int i=0; i<=arr.length-1; i+=2){
         System.out.println(arr[i]+", "+arr[i+1]);
     }
        System.out.println("=====================");
     int[] num={11,22,33,44,55};
     int sum=0;
     for (int i=0; i<=num.length-1; i++){
         sum+=num[i];
     }
        System.out.println(sum);
    }
}
