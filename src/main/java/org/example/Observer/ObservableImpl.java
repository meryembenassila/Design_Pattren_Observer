package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    // relaion one to many
    private List<Observer> observers = new ArrayList<>();//liste des adresses des observateures
    private int state;

    @Override
    public void subscribe(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void unsubscribe(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
           observers.forEach(observer -> {
               observer.update(this); //j'envoie mon adresse
           });
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public int getState() {
        return state;
    }
}
