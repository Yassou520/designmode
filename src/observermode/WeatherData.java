package observermode;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;

    private int temp;

    public WeatherData(){
        observers = new ArrayList<>();
    }
    public void setData(int temp){
        this.temp = temp;
        notifyAllObservers();
    }
    public void display(){
        for (Observer observer : observers) {

        }
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(this.temp);
        }
    }
}
