package notifier;

public class SmartWatch implements EarthQuakeObserver {
    @Override
    public void notifyAboutEarthQuakeRisk() {
        System.out.println("Smart watch notified about earth quake risk by bluetooth");
    }
}
