package com.myjava.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CarReflection {

	public static void main(String[] args) {
		Class rental = RentCar.class;
		try {
			System.out.println(rental.getName());
			System.out.println(rental.getSimpleName());
			Constructor cc = rental.getConstructor(Integer.TYPE);
			RentCar rent = (RentCar) cc.newInstance(244);

		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
