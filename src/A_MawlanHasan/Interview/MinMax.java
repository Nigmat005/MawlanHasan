package A_MawlanHasan.Interview;

public class MinMax {
    public static int max(int[] arr){
        int max=arr[0];
        for (int each:arr){
            if (each>max){
                max=each;
            }
        }
        return max;
    }

    public static int min(int[] arr2){
        int min=arr2[0];
        for (int each: arr2){
            if (each<min){
                min=each;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] i={11,22,33,44,55};
        System.out.println("max(i) = " + max(i));
        System.out.println("min(i) = " + min(i));
    }

    }


