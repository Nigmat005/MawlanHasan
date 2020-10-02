package A_MawlanHasan.Replit;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary=105600;
        int rate=55;
        double stateTaxRate=0.08;
        double federalTaxRate=0.22;
        int weeklyHours=40;
        int theNumberOfWeeksInYear=48;
        double totalTax=salary*(stateTaxRate+federalTaxRate);
        System.out.println("Your salary is:"+"$ "+rate*weeklyHours*theNumberOfWeeksInYear);
        System.out.println("Your total tax is:"+" "+totalTax);
        System.out.println("Your income after tax is:"+"$ "+(salary-totalTax));


    }
}
