package model;

import java.util.ArrayList;
import java.util.List;

public class EarthQuakeNotifier implements Subject {

    private double earthQuakeRisk = 0.0;
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
        observers.forEach(EarthQuakeObserver::updateAboutEarthquakeRisk);
    }

    public void updateEarthQuakeRisk(double earthQuakeRisk) {
        this.earthQuakeRisk = earthQuakeRisk;
        if (this.earthQuakeRisk > 0.5) {
            notifyObservers();
        }
    }
}
