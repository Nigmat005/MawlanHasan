package A_MawlanHasan.Interview;
public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("Banana"));
    }
    public static String removeDuplicates(String str){
        String result="";
        for (int i=0; i<=str.length()-1; i++){
            if (!result.contains(str.charAt(i)+"")){
                result+=str.charAt(i)+"";
            }
        }
        return result;
    }
}

