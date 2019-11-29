import model.Condo;
import model.House;
import model.HousePricingCalculator;
import model.SingleFamilyHouse;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        HousePricingCalculator housePricingCalculator = new HousePricingCalculator();
        House singleFamilyHouse = new SingleFamilyHouse(2015);
        House oldCondo = new Condo(1950);
        System.out.println("pricing of houses:");
        System.out.println(housePricingCalculator
                .findTotalValueOfHousing(Arrays.asList(singleFamilyHouse, oldCondo)));
    }
}
