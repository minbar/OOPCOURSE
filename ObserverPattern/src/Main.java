import model.*;

public class Main {

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("12345");
        OlderPhone olderPhone = new OlderPhone(14563);
        SmartWatch smartWatch = new SmartWatch("2002345y5t4");

        EarthQuakeNotifier subject = new EarthQuakeNotifier();
        subject.registerObserver(smartPhone);
        subject.registerObserver(olderPhone);
        subject.updateEarthQuakeRisk(0.6);
    }
}
