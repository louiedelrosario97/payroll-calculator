import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); // add scanner

    System.out.print ("Enter Name: "); //prompt for name entry
    String name = scan.nextLine();

    System.out.print ("Enter total hours: "); //prompt for total hours entry
    double hours = scan.nextDouble();

    System.out.print ("Enter pay rate: "); //prompt got pay rate entry
    double payRate = scan.nextDouble();

    //This is a method call, we are calling the 'totalGrossPay' method, and sending the 'hours' and 'payRate' inputs
    double grossPay = totalGrossPay(hours, payRate);


    }
}

