/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumer;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author Acer
 */
public class SharedDataStructure {

    private ArrayBlockingQueue blockit;

    ArrayList<Integer> S1 = new ArrayList<>();
    ArrayList<Long> S2 = new ArrayList<>();

    public void getSharedDataStructure() {
        S1.add(4);
        S1.add(5);
        S1.add(8);
        S1.add(12);
        S1.add(21);
        S1.add(22);
        S1.add(34);
        S1.add(35);
        S1.add(36);
        S1.add(37);
        S1.add(42);

    }

}
