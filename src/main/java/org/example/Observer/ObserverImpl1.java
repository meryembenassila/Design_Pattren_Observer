package org.example.Observer;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        if(observable instanceof ObservableImpl) {
            System.out.println("New State = " + ((ObservableImpl) observable).getState());
        }
    }
}
