import java.util.Scanner;
public class Money {
    public static void main(String[] args){
        double money = 1.0;
        int month = 1;
        double interestRay = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of money: ");
        money = input.nextDouble();
        System.out.println("Enter number of months: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRay =input.nextDouble();

        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRay/100)/12 * month;
        }
        System.out.println("Total of interest: "+totalInterest);
    }
}
