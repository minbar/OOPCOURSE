import bank.constants.LoanType;
import bank.model.CreditScore;
import bank.model.Loan;
import bank.model.User;
import bank.service.HighCreditScoreIRC;
import bank.service.InterestCalculator;
import bank.service.LowCreditScoreIRC;
import bank.service.factory.InterestCalculatorFactory;
import bank.service.factory.InterestCalculatorFactoryImpl;

public class Main {

    public static void main(String[] args) {
        User john = new User("john", 4000, new CreditScore(760));
        Loan loan = new Loan(10000, LoanType.CONSUMER);
        InterestCalculatorFactory interestCalculatorFactory = new InterestCalculatorFactoryImpl();
        double interestRate = interestCalculatorFactory.getInterestRateCalculator(john).calculateInterestRate(loan);
        System.out.println("Johns interest rate: " + interestRate);
    }
}
