package com;

import java.util.function.Supplier;

public class SupplierRunner {

	public static void main(String[] args) {
		Supplier s1 = () -> (int) Math.random() * 11;// without generic object
		System.out.println(s1.get());

		Supplier s2 = () -> "Hello Sarthak";// without generic object
		System.out.println(s2.get());

		Supplier<Integer> s3 = () -> 10;
		System.out.println(s3.get());
	}
}
