package com.violate.singletone.reflection;

	public class DiscountWaiver implements Cloneable {

	       private DiscountWaiver() {
	              System.out.println("Creating Instance");
	       }

	       private static DiscountWaiver waiver = new DiscountWaiver();

	       public static DiscountWaiver getInstance() {
	              return waiver;
	       }

	       @Override
	       protected Object clone() throws CloneNotSupportedException {
	              return super.clone();
	       }

	}



