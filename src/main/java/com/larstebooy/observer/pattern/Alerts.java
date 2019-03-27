package com.larstebooy.observer.pattern;

import java.util.ArrayList;

public class Alerts implements Subject {
    private ArrayList<Observer> observers;
    private String weatherConditions;
    private String nationalThreatColor;
    private String threatInstructions;

    public Alerts() {

        observers = new ArrayList<>();

    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        int observerIndex = observers.indexOf(observer);

        observers.remove(observerIndex);

        System.out.println("Observer " + (observerIndex + 1) + " deleted");
    }

    @Override
    public void notifyObserver() {

        for (Observer observer : observers) {
            observer.alertsChanged(weatherConditions, nationalThreatColor, threatInstructions);
        }
    }

    public void setWeatherConditions(String newWeatherConditions){

        this.weatherConditions = newWeatherConditions;
        notifyObserver();

    }

    public void setNationalThreatColor(String newNationalThreatColor){

        this.nationalThreatColor = newNationalThreatColor;
        notifyObserver();

    }

    public void setThreatInstructions(String newThreatInstructions){

        this.threatInstructions = newThreatInstructions;
        notifyObserver();

    }

}
