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
public class Producer extends Thread {

    SharedDataStructure sds;

    @Override
    public void run() {
        while (sds.S1.iterator().hasNext()) {
            long data = fib(sds.S1.iterator().next());
            sds.S2.add(data);
        }
        if(sds.S1.isEmpty()){
        stop();
        }
    }

    public long fib(long n) {
        if ((n == 0) || (n == 1)) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

}
