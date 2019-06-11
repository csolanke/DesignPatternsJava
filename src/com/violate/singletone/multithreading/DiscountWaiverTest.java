package com.violate.singletone.multithreading;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DiscountWaiverTest {

          public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

                   ExecutorService executorPool = Executors.newFixedThreadPool(3);
                   
                   executorPool.submit(DiscountWaiverTest::useSingleTone);
                   executorPool.submit(DiscountWaiverTest::useSingleTone);
                   executorPool.submit(DiscountWaiverTest::useSingleTone);

                   
                   executorPool.shutdown();

          }
          
          private static void useSingleTone()
          {
       	    DiscountWaiver instance = DiscountWaiver.getInstance();
       	    
       	    System.out.println(instance);
       	   
          }
}