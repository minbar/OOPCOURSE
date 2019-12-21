package model;

public class SmartPhone implements EarthQuakeObserver {

    private final String smartPhoneId;

    public SmartPhone(String smartPhoneId) {
        this.smartPhoneId = smartPhoneId;
    }

    @Override
    public void updateAboutEarthquakeRisk() {
        System.out.println("Sending notification to smartphone: " + smartPhoneId);
    }
}
