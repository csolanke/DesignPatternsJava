package com.violate.singleton.clone;

import java.lang.reflect.InvocationTargetException;

public class DiscountWaiverTest {

          public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

                   DiscountWaiver instance2 = DiscountWaiver.getInstance();
                   DiscountWaiver instance = DiscountWaiver.getInstance();

                   System.out.println(instance);
                   System.out.println(instance2);

                   DiscountWaiver instance1 = null;
                   try {
                             instance1 = (DiscountWaiver) instance.clone();
                   }
                   catch (CloneNotSupportedException e) {

                             e.printStackTrace();
                   }

                   System.out.println(instance1);

          }
}

