package model;

import constants.HouseType;

import java.time.LocalDate;

import static constants.HousePricingConstants.*;

public class Condo implements House {

    private final int yearBuilt;

    public Condo(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    @Override
    public int getAge() {
        return LocalDate.now().getYear() - yearBuilt;
    }

    @Override
    public HouseType getType() {
        return HouseType.CONDO;
    }

    @Override
    public int getPrice() {
        double ageCof = getAge() > 30 ? OLD_HOUSE_PRICING_COEFICIENT : NEW_HOUSE_PRICING_COFICIENT;
        return (int) (BASE_HOUSE_PRICE * ageCof);
    }
}
