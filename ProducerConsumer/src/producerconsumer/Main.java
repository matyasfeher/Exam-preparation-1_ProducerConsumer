/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumer;

/**
 *
 * @author Acer
 */
public class Main extends Thread {

    SharedDataStructure sds = new SharedDataStructure();

    @Override
    public void run() {
        sds.getSharedDataStructure();
        Producer p1 = new Producer();
        Producer p2 = new Producer();
        Producer p3 = new Producer();
        Producer p4 = new Producer();
        Consumer c1 = new Consumer();
        
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        
        c1.start();
    }
}
