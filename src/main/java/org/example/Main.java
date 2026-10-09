package org.example;

import org.example.Observer.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer observer = new ObserverImpl1();
        Observer observer1 = new ObserverImpl2();
        observable.subscribe(observer);
        observable.subscribe(observer1);
         observable.setState(2);
         System.out.println(("----------------------------"));
        observable.setState(5);
        System.out.println(("----------------------------"));
        observable.unsubscribe(observer1);
        observable.subscribe(new Observer() {
            @Override
            public void update(int state) {
                System.out.println(" Res " + state+Math.random());
            }
        });
        observable.subscribe(state -> System.out.println(" Res2 " + state+Math.random()));
        observable.setState(1);
    }
}