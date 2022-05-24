/**
 * Java Course 3, Module 1 - Practice
 * 
 * Savings Account Comparison 
 *
 * @author Charles Vincent Pitagan
 */
public class SavingsAccountDriver {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount("10002", 2000);
        SavingsAccount saver2 = new SavingsAccount("10003", 3000);
        saver1.setAnnualInterestRate(0.05);
        saver2.setAnnualInterestRate(0.05);
    
        int noMonthInAYear = 12;
        System.out.println("Monthly balances for one year with 0.05 annual interest: \n");
        System.out.format("%-18s", "Month");

        for(int x = 0; x < SavingsAccount.countInstatiated; x++) { 
            System.out.format("%-18s %-18s", "AccountNo", "Balance");       
        }

        for(int y = 0; y <= noMonthInAYear; y++) {
            System.out.format("%n %-16s %-18s %.2f %-9s %-18s %.2f", 
                                                                        y, 
                                                                        saver1.getACCOUNT_NUMBER(), 
                                                                        saver1.getBalance(), 
                                                                        " ",
                                                                        saver2.getACCOUNT_NUMBER(), 
                                                                        saver2.getBalance());
            if(y != 12) {
                saver1.addMonthlyInterest();
                saver2.addMonthlyInterest();
            }
                
        }

        double finalBalance = saver1.getBalance() + saver2.getBalance();
        System.out.printf("\n\nFinal balance of both accounts combined: %.2f", finalBalance);
        
    }
}