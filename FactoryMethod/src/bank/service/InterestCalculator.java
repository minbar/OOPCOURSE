package bank.service;

import bank.model.Loan;

public interface InterestCalculator {

    double calculateInterestRate(Loan loan);
}
