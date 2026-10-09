package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> historique = new ArrayList<>();
    @Override
    public void update(Observable observable) {
        if(observable instanceof  ObservableImpl observable1) {
            historique.add(observable1.getState());
            double sum = 0;

            for (int i = 0; i < historique.size(); i++) {
                sum = sum + historique.get(i);
            }
            System.out.println("Moyenne " + sum / historique.size());

        }
    }
}
