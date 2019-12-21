package model;

public interface Subject {

    void registerObserver(EarthQuakeObserver observer);
    void removeObserver(EarthQuakeObserver observer);
    void notifyObservers();

}
