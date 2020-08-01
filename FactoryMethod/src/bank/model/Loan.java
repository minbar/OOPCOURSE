package bank.model;

import bank.constants.LoanType;

import java.util.Objects;

public class Loan {

    private final int amount;
    private final LoanType loanType;

    public Loan(int amount, LoanType loanType) {
        this.amount = amount;
        this.loanType = loanType;
    }

    public int getAmount() {
        return amount;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return amount == loan.amount &&
                loanType == loan.loanType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, loanType);
    }

    @Override
    public String toString() {
        return "Loan{" +
                "amount=" + amount +
                ", loanType=" + loanType +
                '}';
    }
}
