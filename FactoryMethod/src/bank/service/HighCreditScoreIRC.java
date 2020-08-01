package bank.service;

import bank.constants.LoanType;
import bank.model.Loan;

public class HighCreditScoreIRC implements InterestCalculator {
    @Override
    public double calculateInterestRate(Loan loan) {
        if (LoanType.MORTGAGE.equals(loan.getLoanType())) {
            return 0.5;
        } else {
            return 2;
        }
    }
}
