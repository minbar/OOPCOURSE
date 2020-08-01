package notifier;

public class SmartPhone implements EarthQuakeObserver {

    @Override
    public void notifyAboutEarthQuakeRisk() {
        System.out.println("Smartphone notified about earthquake");
    }
}
