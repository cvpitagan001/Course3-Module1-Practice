public class SavingsAccount {
    private final String ACCOUNT_NUMBER;
    private double balance;
    private double annualInterestRate;
    static int countInstatiated;

    public SavingsAccount(String ACCOUNT_NUMBER, double balance) {
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.balance = balance;
        countInstatiated++;
    }

    public void addMonthlyInterest() {
        double interestMontly = this.balance * (this.annualInterestRate / 12);
        this.balance += interestMontly;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getACCOUNT_NUMBER() {
        return ACCOUNT_NUMBER;
    }

    public double getBalance() {
        return balance;
    }
}


