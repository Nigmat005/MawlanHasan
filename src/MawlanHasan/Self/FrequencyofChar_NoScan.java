package MawlanHasan.Self;

public class FrequencyofChar_NoScan {
    public static void main(String[] args) {
        String str="mmaawwllaann";
        char ch='a';
        int count=0;
        for (int i=0; i<=str.length()-1; i++){
            char each=str.charAt(i);
            if (ch==each){
                count++;
            }
        }
        System.out.println(count);
    }
}
