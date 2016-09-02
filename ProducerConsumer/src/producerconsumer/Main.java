/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class Main implements Runnable {

    public BlockingQueue blockit = new LinkedBlockingQueue();

    @Override
    public void run() {

        Thread p1 = new Thread(new Producer(blockit));
        Thread p2 = new Thread(new Producer(blockit));
        Thread p3 = new Thread(new Producer(blockit));
        Thread p4 = new Thread(new Producer(blockit));
        Thread c1 = new Thread(new Consumer(blockit));
        
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        c1.start();
        
        try {
            p1.join();
            p2.join();
            p3.join();
            p4.join();
            c1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
