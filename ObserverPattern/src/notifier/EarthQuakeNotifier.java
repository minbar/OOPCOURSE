package notifier;

import java.util.ArrayList;
import java.util.List;

public class EarthQuakeNotifier implements Subject {

    private double earthQuakeRisk = 0;
    private final List<EarthQuakeObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(EarthQuakeObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(EarthQuakeObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(EarthQuakeObserver::notifyAboutEarthQuakeRisk);
    }

    public void updateEarthQuakeRisk(double risk) {
        this.earthQuakeRisk = risk;
        if (earthQuakeRisk > 0.5) {
            notifyObservers();
        }
    }
}
