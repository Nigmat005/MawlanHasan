package A_MawlanHasan.Replit;

/*1.    A triangle is valid if the sum of all the three angles is equal to 180 degrees.
        Write a program that declares three integers as angles and check whether a triangle
        is valid or not.

        Note: MUST use if&else statement
        2. write a program that can check if the two characters (chars) are same characters
        if same, print: "Same characters"
        otherwise, print: "Different characters"
        3. SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017. wirte a program that can check if the vehicle is eligible to recall.
        if eligible, print: true
        otherwise: false                */

/*  public class If_Staement {
    public static void main(String[] args) {
        double a=45;
        double b=35;
        double c=90;
        double sum=a+b+c;


        if (sum==180){
            System.out.println("it is a triangle");
        }else{
            System.out.println("it is not a triangle");
        }



        char math='y';
        char num='y';
        if (math==num){
            System.out.println("same character");
        }else{
            System.out.println("same character");
        }

*/

public class If_Staement {
    public static void main(String[] args) {
        int carYear=2016;

        boolean eligibleCars=  (carYear>=1995 && carYear<=1998) || (carYear==2001 && carYear==2002) || (carYear>=2004 && carYear<=2006) || (carYear>=2015 && carYear<=2017);
        if (eligibleCars){
            System.out.println("Is Eligible");
        }else{
            System.out.println("Not Eligible");
        }





    }
}
