package com.larstebooy.observer.pattern;

public class ConditionObserver implements Observer {

    private String weatherConditions;
    private String nationalThreatColor;
    private String threatInstructions;

    private Subject alerts;

    public ConditionObserver(Subject alerts){
        this.alerts = alerts;

        alerts.register(this);
    }

    @Override
    public void alertsChanged(String weatherConditions, String nationalThreatColor, String threatInstructions) {
        this.weatherConditions = weatherConditions;
        this.nationalThreatColor = nationalThreatColor;
        this.threatInstructions = threatInstructions;

        printAlerts();

    }

    private void printAlerts() {
        System.out.println(String.format("\nWeatherConditions: %s\nNationalThreatColor: %s\nThreatInstructions: %s", weatherConditions, nationalThreatColor, threatInstructions));
    }
}
