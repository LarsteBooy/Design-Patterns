package com.larstebooy.observer.pattern;

public interface Subject {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObserver();

}
