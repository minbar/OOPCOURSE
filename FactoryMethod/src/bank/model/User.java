package bank.model;

import java.util.Objects;

public class User {
    private final String name;
    private final int monthlyIncome;
    private final CreditScore creditScore;

    public User(String name, int monthlyIncome, CreditScore creditScore) {
        this.name = name;
        this.monthlyIncome = monthlyIncome;
        this.creditScore = creditScore;
    }

    public String getName() {
        return name;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public CreditScore getCreditScore() {
        return creditScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return monthlyIncome == user.monthlyIncome &&
                Objects.equals(name, user.name) &&
                Objects.equals(creditScore, user.creditScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, monthlyIncome, creditScore);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", monthlyIncome=" + monthlyIncome +
                ", creditScore=" + creditScore +
                '}';
    }
}
