package MawlanHasan.Self;

public class Main2 {
    public static void main(String[] args) {
  /*      double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your name");
        name = scan.nextLine();
​
        System.out.println("Do you have a US driver license?");
        String valid_DL = scan.next();
​
        if (valid_DL.equalsIgnoreCase("No")) {
            System.out.println("Invalid data!");
            System.exit(0);
        }
​
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        if (zipCode == 20910 || zipCode == 20740) {
            premium += 60;
        } else if (zipCode == 22102 || zipCode == 22103) {
            premium += 30;
        } else {
            premium += 50;
        }
​
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();

        if (vehicleOwnership.equalsIgnoreCase("Owned")) {
            premium += 10;
        } else {
            premium += 20;
        }
​
        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();

        if (vehicleUsage.equalsIgnoreCase("Business")) {
            premium += 50;
        } else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
            premium += 10;
        } else if (vehicleUsage.equalsIgnoreCase("Commute")) {
            premium += 20;

            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool = scan.nextInt();
            premium += daysDrivenToWorkOrSchool * 5;
​
            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();

            premium += milesToWorkOrSchool * 1;
        }
​
        System.out.println("How old are you?");
        int age = scan.nextInt();
​
        if (age < 16) {
            System.out.println("Invalid data!");
            System.exit(0);
        } else if (age < 18) {
            premium *= 20;
        } else if (age <= 21) {
            premium *= 6;
        } else if (age < 25) {
            premium *= 2;
        }
​
        System.out.println("How many years you've been driving?");
        int driving_Exp = scan.nextInt();
        int result = age - driving_Exp;
        if (driving_Exp > 0 && result >= 16) {

            premium -= driving_Exp * 5;
        } else {
            System.out.println("Invalid data!");
            System.exit(0);
        }

​
        System.out.println("Have you had any accidents in the last 5 years?");
        String accidents = scan.next();
        if (accidents.equalsIgnoreCase("Yes")) {
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            premium += premium * 0.2 * accidentsAmount;
        }


        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.next();
        if (continuousInsurance.equalsIgnoreCase("No")) {
            premium *= 2;//double it
        }
​
        scan.nextLine();
        System.out.println("What is the highest level of education you have completed?");
        education = scan.nextLine();
        if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Masters") || education.equalsIgnoreCase("Bachelors")) {
            premium -= premium * 0.05;
        } else if (education.equalsIgnoreCase("Doctors")) {
            premium -= premium * 0.1;
        } else if (education.equalsIgnoreCase("Less than High School")) {
            premium += premium * 0.05;
        }
​
        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" + premium);
        referenceNumber = name.substring(0, 2) + age + name.substring(name.length() - 2) + zipCode + education.replace(" ", "");
        System.out.println("Reference number: " + referenceNumber.toUpperCase());
​*/
    }

}