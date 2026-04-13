import java.util.Scanner;

public class PayrollCalculator {
    static void main(String[] ignoredArgs) {
    Scanner scan = new Scanner(System.in); // add scanner

    System.out.print ("Enter Name: "); //prompt for name entry
    String name = scan.nextLine();

    System.out.print ("Enter total hours worked this year: "); //prompt for total hours entry
    double hours = scan.nextDouble();

    System.out.print ("Enter pay rate: "); //prompt got pay rate entry
    double payRate = scan.nextDouble();

    double grossPay; //declare variable outside of curly braces to access later

    if (hours > 40) {
            double regularPay = payRate * 40;
            double overtimePay = (hours - 40) * (payRate * 1.5);
            grossPay = (regularPay + overtimePay); }
    else {
            grossPay = hours * payRate;}

    System.out.println("Hey " + name + ", you only made $" + String.format("%.2f", grossPay) + " in gross pay this year. Yikes.");
    }
}

