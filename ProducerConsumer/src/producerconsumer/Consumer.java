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
public class Consumer extends Thread {

    SharedDataStructure sds;
    long count;

    @Override
    public void run() {
        while (sds.S2.iterator().hasNext()) {
            long temp = sds.S2.iterator().next();
            count += temp;
            sds.S2.remove(sds.S2.get((int) temp));

            System.out.println("" + count);
        }

    }
}
