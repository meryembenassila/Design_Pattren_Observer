package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> historique = new ArrayList<>();
    @Override
    public void update(int newstate) {
        historique.add(newstate);
        double sum = 0 ;

        for (int i = 0 ; i<historique.size();i++){
            sum = sum +historique.get(i) ;
        }
        System.out.println("Moyenne "+ sum/historique.size());

    }
}
