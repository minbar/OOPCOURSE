import carfactory.parts.factory.AudiCarPartFactory;
import carfactory.parts.factory.CarPartFactory;
import carfactory.parts.factory.VolvoCarPartFactory;

public class Main {

    public static void main(String[] args) {
        CarPartFactory carPartFactory = new AudiCarPartFactory();

        carPartFactory.getEngine().describe();
        carPartFactory.getBuffer().describe();
    }
}
