package loancalculator;

import java.util.Scanner;

public class LoanCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double loanAmount = 0, annualInterestRate = 0;
        int loadPeriod = 0;
        
        System.out.print("Input loan amount: ");
        try {
            loanAmount = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Enter only numbers!");
        }
        System.out.print("Input annual interest rate: ");
        try {
            annualInterestRate = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Enter only numbers!");
        }
        System.out.print("Input loan period (years): ");
        try {
            loadPeriod = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Enter only numbers!");
        }
        
        double monthlyInterestRate = (annualInterestRate / (100*12));
        double numberofPayments = (double)loadPeriod * 12;
                
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 / (1+monthlyInterestRate), numberofPayments));
        double totalPayment = monthlyPayment * numberofPayments;
        
        System.out.printf("\n%-30s$%.3f\n", "Loan Amount:", loanAmount);
        System.out.printf("%-30s %.3f%%\n", "Annual Interest Rate:", annualInterestRate);
        System.out.printf("%-30s %d\n", "Loan Period (years):", loadPeriod);

        System.out.printf("\n%-30s$%.3f\n", "Monthly payment:", monthlyPayment);
        System.out.printf("%-30s$%.3f\n", "TOTAL PAYMENT:", totalPayment);
    }
    
}
