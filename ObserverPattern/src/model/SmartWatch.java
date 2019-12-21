package model;

public class SmartWatch implements EarthQuakeObserver {

    private final String bluetoothId;

    public SmartWatch(String blueToothId) {
        this.bluetoothId = blueToothId;
    }

    @Override
    public void updateAboutEarthquakeRisk() {
        System.out.println("bluetooth notification sent to smartwatch: " + bluetoothId);
    }
}
