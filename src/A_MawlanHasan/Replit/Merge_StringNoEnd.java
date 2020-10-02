package A_MawlanHasan.Replit;

public class Merge_StringNoEnd {
    public static void main(String[] args) {
        String str="Mawla";
        String str1="Hasan";
        if (str.length()!=str1.length()){
            System.out.println("Length must be equal");
        }else{
            System.out.println(""+str.charAt(0)+str1.charAt(0)+str.charAt(1)+str1.charAt(1)+str.charAt(2)+str1.charAt(2)+str.charAt(3)+str1.charAt(3)+str.charAt(4)+str1.charAt(4));
        }
        System.out.println("=====================================================");
        String str3="Mawlan";
        String withOut=str3.substring(0,str.length());
        System.out.println(withOut);
    }
}
