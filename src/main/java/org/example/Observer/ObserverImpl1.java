package org.example.Observer;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(int newstate) {
        System.out.println("New State = "+ newstate);

    }
}
