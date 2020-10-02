package A_MawlanHasan.Replit;

import java.util.Scanner;

public class tip {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Split:");
        String splitOrNot=scan.next();
        String quality;
        int NumofPeople;
        double totalToPay=0, totalTip=0, totalPerPerson=0, tipPerPerson=0;

        if(splitOrNot.equalsIgnoreCase("Yes")){


            System.out.println("Number of people:");
            NumofPeople=scan.nextInt();

            System.out.println("Check amount:");
            totalToPay=scan.nextDouble();

            System.out.println("Service Quality:");
            quality=scan.next();

            switch(quality.toLowerCase() ){
                case "poor" :
                    totalTip=totalToPay * 0.05;
                    break;
                case "fair" :
                    totalTip=totalToPay * 0.1;
                    break;
                case "good" :
                    totalTip=totalToPay * 0.15;
                    break;
                case "great" :
                    totalTip=totalToPay * 0.2;
                    break;
                case "excellent" :
                    totalTip=totalToPay * 0.25;
                    break;

            }
            totalToPay=totalToPay+totalTip;
            totalPerPerson=totalToPay / NumofPeople;
            tipPerPerson=totalTip / NumofPeople;

            String numPpeAmpersand="";
            for(int x=1; x<=NumofPeople; x++){
                numPpeAmpersand+="&";
            }
            System.out.println("Number of people entered: "+ numPpeAmpersand);
            System.out.println("Total to pay: "+ totalToPay);
            System.out.println("Total tip: "+ totalTip);
            System.out.println("Total per person: "+ totalPerPerson);
            System.out.println("Tip per person: "+ tipPerPerson);




        }


    }
}


