package A_MawlanHasan.Extra;
import java.util.Scanner;
public class Extra {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Split:");
        String splitornot=scan.next();

        String quality;
        int NumofPeople;
        double totalToPay=0, totapTip=0, totalPerPerson=0, tipPerPerson=0;

        if(splitornot.equalsIgnoreCase("Yes")){

            System.out.println("Number of people:");
            NumofPeople=scan.nextInt();

            System.out.println("Check amount:");
            totalToPay=scan.nextDouble();

            System.out.println("Service Quality:");
            quality=scan.next();

            switch(quality.toLowerCase()){
                case "Poor" :
                    totapTip=totalToPay * 0.05;
                    break;
                case "Fair" :
                    totapTip=totalToPay * 0.1;
                    break;
                case "Good" :
                    totapTip=totalToPay * 0.15;
                    break;
                case "Great" :
                    totapTip=totalToPay * 0.2;
                    break;
                case "Excellent" :
                    totapTip=totalToPay * 0.25;
                    break;

            }
            totalToPay=totalToPay+totapTip;
            totalPerPerson=totalToPay / NumofPeople;
            tipPerPerson=totapTip / NumofPeople;

            String numPpeAmpersand="";
            for(int x=1; x<=NumofPeople; x++){
                numPpeAmpersand+="&";
            }
            System.out.println("Number of people entered: "+ numPpeAmpersand);
            System.out.println("Total to pay: "+ totalToPay);
            System.out.println("Total tip: "+ totapTip);
            System.out.println("Total per person: "+ totalPerPerson);
            System.out.println("Tip per person: "+ tipPerPerson);




        }


    }
}
