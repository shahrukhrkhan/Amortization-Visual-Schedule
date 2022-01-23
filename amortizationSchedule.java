import java.util.Scanner;
   
   public class amortizationSchedule{
   //Main method
   public static void main(String[] args){
      //Scanner object to get user input
      Scanner scanner = new Scanner(System.in);
      //variables
      double loanAmt, payment;
      double amount;
      double interestRate; 
      //print line to gather user input for loan details
      System.out.println("What is the loan amount: ");
      loanAmt = scanner.nextDouble();
      double bal = loanAmt;
   
      System.out.println("Enter the number of payments: ");
      payment = scanner.nextDouble();
   
      System.out.println("Enter the payment amount: ");
      amount = scanner.nextDouble();
   
      System.out.println("Enter the interest rate: ");
      interestRate = scanner.nextDouble();
   //for loop to calculate the schedule
   for (int i = 1; i <= payment; i++){
      double interest = interestRate/100*bal;
      double prin = amount-interest;
      double nBal = bal - prin;
      bal = nBal;
     //display using printformat for the amortization schedule 
     System.out.printf("%-4s%-12s%-12s%-12s%-12s%-12s\n", "Yr", "Balance", "Payment",
      "Interest", "Principle", "New Balance");

     System.out.printf("%-4d%-12.2f%-12.2f%-12.2f%-12.2f%-12.2f\n", i, bal, amount, 
     interest, prin, nBal);
    }
   }
  }
