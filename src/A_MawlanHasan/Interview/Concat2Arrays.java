package A_MawlanHasan.Interview;

import java.util.Arrays;

public class Concat2Arrays {
    public static int[] concat(int[] arr1, int[] arr2){
        int[] endResult=new int[arr1.length+arr2.length];
        int i=0;
        for (int each:arr1){
            endResult[i]=each;
            i++;
        }
        for (int each:arr2){
            endResult[i]=each;
            i++;
        }
        return endResult;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10};
        System.out.println(Arrays.toString(concat(arr1, arr2)));
    }
}
