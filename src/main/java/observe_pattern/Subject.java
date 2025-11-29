package main.java.observe_pattern;
public interface Subject {
    public void registerObserver(Observer2 o);

    public void removeObserver(Observer2 o);

    public void notifyObservers();
}