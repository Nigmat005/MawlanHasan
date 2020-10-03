package A_MawlanHasan.Practice;

public class Frequncy {
    public static void main(String[] args) {
        String str="banana";
        System.out.println(frequncy(str));
    }

    public static String frequncy(String str){
        String nondup="";
        for (int i=0; i<=str.length()-1; i++){
            String s=str.charAt(i)+"";
            if (!nondup.contains(s)){
                nondup+=s;
            }
        }
        String actualResult="";
        for (int k=0;k<=nondup.length()-1; k++){
            char ch=nondup.charAt(k);// b a n
            int count=0;
            for (int j=0; j<=str.length()-1; j++){
                char ch2=str.charAt(j);
                if (ch2==ch){
                    count++;
                }
            }
            actualResult+=""+ch+count;
        }
        return actualResult;
    }

}
