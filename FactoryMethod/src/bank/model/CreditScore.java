package bank.model;

import java.util.Objects;

public class CreditScore {

    private final int score;

    public CreditScore(int score) {
        this.score = score;
    }

    public int getCreditScoreInt() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditScore that = (CreditScore) o;
        return score == that.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(score);
    }

    @Override
    public String toString() {
        return "CreditScore{" +
                "score=" + score +
                '}';
    }
}
