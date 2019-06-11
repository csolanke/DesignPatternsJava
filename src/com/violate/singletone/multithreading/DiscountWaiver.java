package com.violate.singletone.multithreading;

	public class DiscountWaiver implements Cloneable {

	       private DiscountWaiver() {
	              System.out.println("Creating Instance");
	       }

	       private static DiscountWaiver waiver = null;

	       public static synchronized DiscountWaiver getInstance() {
	    	   
	    	   if(waiver == null)
	    	   {
	    		   waiver = new DiscountWaiver();
	    	   }
	              return waiver;
	       }

	       @Override
	       protected Object clone() throws CloneNotSupportedException {
	              return super.clone();
	       }

	}



