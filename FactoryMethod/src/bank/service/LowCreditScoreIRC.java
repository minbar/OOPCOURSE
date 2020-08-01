package bank.service;

import bank.constants.LoanType;
import bank.model.Loan;

public class LowCreditScoreIRC implements InterestCalculator {
    @Override
    public double calculateInterestRate(Loan loan) {
        if (LoanType.MORTGAGE.equals(loan.getLoanType())) {
            return 2;
        } else {
            return 5;
        }
    }
}
