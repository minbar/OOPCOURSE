package model;

import constants.HouseType;

import java.util.List;

public class HousePricingCalculator {

    public int findTotalValueOfHousing(List<House> houses) {
        return houses.stream().map(House::getPrice).reduce(0, Integer::sum);
    }
}
