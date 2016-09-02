/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumer;

import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Acer
 */
public class Consumer implements Runnable {

    private final BlockingQueue blockit;
   
    long count;

    public Consumer(BlockingQueue blockit){
    this.blockit = blockit;
    }
    
    @Override
    public void run() {
        while (true) {
            long temp = 0;
             try {
                 temp = (long) blockit.take();
                
            } catch (Exception e) {
                 System.out.println("Couldnt retrive data from the queue"); 
           }
            count+= temp;
            
            
            
        }
            
        }

    }

