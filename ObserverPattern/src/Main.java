import notifier.EarthQuakeNotifier;
import notifier.OlderPhone;
import notifier.SmartPhone;
import notifier.SmartWatch;

public class Main {

    public static void main(String[] args) {
        SmartWatch smartWatch = new SmartWatch();
        SmartPhone smartPhone = new SmartPhone();
        OlderPhone phone = new OlderPhone();

        EarthQuakeNotifier earthQuakeNotifier = new EarthQuakeNotifier();
        earthQuakeNotifier.registerObserver(smartPhone);
        earthQuakeNotifier.registerObserver(smartWatch);
        earthQuakeNotifier.registerObserver(phone);
        earthQuakeNotifier.updateEarthQuakeRisk(0.6);
    }
}
