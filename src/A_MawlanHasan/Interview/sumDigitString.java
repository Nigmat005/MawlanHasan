package A_MawlanHasan.Interview;

public class sumDigitString {
    public static int sumDigit(String str){
        int total=0;
        char[] ch=str.toCharArray();
        for (char each: ch){
            if (Character.isDigit(each)){
                total+=Integer.valueOf(""+each);
                each++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sumDigit("Mawlan"));
    }
}
