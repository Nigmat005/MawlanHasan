package MawlanHasan.Replit;

public class Vehicle_Recall {
    public static void main(String[] args) {
        int vehicleYear=2020;
        boolean validForRecall = (vehicleYear >=1995 && vehicleYear <=1998) || (vehicleYear >=2001 && vehicleYear <=2002)
                || (vehicleYear >=2004 && vehicleYear <=2006) || (vehicleYear>=2015 && vehicleYear <=2017);

        String result = (validForRecall) ? "Your vehicle needs to be recalled!": "Your vehicle is fine, enjoy!";

        System.out.println(result);
    }
}
