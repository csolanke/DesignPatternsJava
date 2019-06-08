package com.violate.singletone.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DiscountWaiverTest {

          public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

                   DiscountWaiver instance2 = DiscountWaiver.getInstance();
                   DiscountWaiver instance = DiscountWaiver.getInstance();

                   System.out.println(instance);
                   System.out.println(instance2);

                   DiscountWaiver instance3 = null;

                   try {

                             Class<DiscountWaiver> disocuntWaiver = (Class<DiscountWaiver>) Class.forName("com.violate.singletone.reflection.DiscountWaiver");

                             Constructor<?>[] declaredConstructors = disocuntWaiver.getDeclaredConstructors();

                             for (Constructor<?> constructor : declaredConstructors) {

                                      constructor.setAccessible(true);

                                      instance3 = (DiscountWaiver) constructor.newInstance();
                             }
                   }
                   catch (ClassNotFoundException e) {
                             e.printStackTrace();
                   }

                   System.out.println(instance3);
          }
}