package notifier;

public class OlderPhone implements EarthQuakeObserver {
    @Override
    public void notifyAboutEarthQuakeRisk() {
        System.out.println("Phone notified by sms message");
    }
}
