package MawlanHasan.Replit;

public class LoopEveryChar_Vowel {
    public static void main(String[] args) {
      String name="Mawlan";
      for (int i=name.length()-1; i>=0; i--){
          System.out.println(name.charAt(i));
      }
      String s="Mawlankhotani";
      for (int i=0; i<=s.length()-1; i++){
          char single=s.charAt(i);
          if (single=='a' || single=='o' || single =='e' || single=='i' || single=='u'){
              System.out.println(single);
          }
      }

    }
}
