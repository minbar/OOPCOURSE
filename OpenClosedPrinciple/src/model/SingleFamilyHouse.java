package model;

import constants.HouseType;

import java.time.LocalDate;
import java.util.Objects;

import static constants.HousePricingConstants.*;

public class SingleFamilyHouse implements House {

    private final int yearBuilt;

    public SingleFamilyHouse(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    @Override
    public int getAge() {
        return LocalDate.now().getYear() - yearBuilt;
    }

    @Override
    public HouseType getType() {
        return HouseType.SINGLE_FAMILY;
    }

    @Override
    public int getPrice() {
        double ageCof = getAge() > 30 ? OLD_HOUSE_PRICING_COEFICIENT : NEW_HOUSE_PRICING_COFICIENT;
        return (int) (BASE_HOUSE_PRICE * ageCof) + FAMILY_HOUSE_BONUS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SingleFamilyHouse that = (SingleFamilyHouse) o;
        return yearBuilt == that.yearBuilt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearBuilt);
    }

    @Override
    public String toString() {
        return "SingleFamilyHouse{" +
                "yearBuilt=" + yearBuilt +
                '}';
    }
}
