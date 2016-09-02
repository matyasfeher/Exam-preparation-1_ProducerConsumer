/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class Producer implements Runnable {

    long[] fib = {4, 5, 8, 12, 21, 22, 34, 35, 36, 37, 42};
    private final BlockingQueue blockit;

    public Producer(BlockingQueue blockit) {
        this.blockit = blockit;

    }

    @Override
    public void run() {
        for (int i = 0; i < fib.length; i++) {
            try {
                blockit.put(fib(fib[i]));
            } catch (Exception e) {
                System.out.println("Couldn't queue it up!!");
            }

        }

//        while (sds.S1.iterator().hasNext()) {
//            try {
//
//                blockit.put(sds.S1.iterator().next());
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            long data = fib(sds.S1.iterator().next());
//            sds.S2.add(data);
//        }
    }

    public long fib(long n) {
        if ((n == 0) || (n == 1)) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

}
