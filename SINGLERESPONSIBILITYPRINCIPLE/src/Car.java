import constant.Model;

import java.time.LocalDate;

public class Car {

    private final Model model;
    private final LocalDate dateOfRegistration;
    private final LocalDate dateManufactured;
    private final User owner;


    public Car(Model model, LocalDate dateOfRegistration,
               LocalDate dateManufactured, User owner) {
        if (dateOfRegistration.isBefore(dateManufactured)) {
            throw new Error();
        }

        this.model = model;
        this.dateOfRegistration = dateOfRegistration;
        this.dateManufactured = dateManufactured;
        this.owner = owner;
    }

    public Model getModel() {
        return model;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public LocalDate getDateManufactured() {
        return dateManufactured;
    }

    public User getOwner() {
        return owner;
    }
}
