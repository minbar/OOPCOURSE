package bank.service.factory;

import bank.model.User;
import bank.service.InterestCalculator;

public interface InterestCalculatorFactory {

    InterestCalculator getInterestRateCalculator(User user);
}
