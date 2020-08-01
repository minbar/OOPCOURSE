package bank.service.factory;

import bank.model.User;
import bank.service.HighCreditScoreIRC;
import bank.service.InterestCalculator;
import bank.service.LowCreditScoreIRC;

public class InterestCalculatorFactoryImpl implements InterestCalculatorFactory {

    @Override
    public InterestCalculator getInterestRateCalculator(User user) {
        if (user.getCreditScore().getCreditScoreInt() > 750) {
            return new HighCreditScoreIRC();
        } else {
            return new LowCreditScoreIRC();
        }
    }
}
