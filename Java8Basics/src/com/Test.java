package com;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		
		Predicate<Integer> p1=(n)->n>100;
		System.out.println(p1.test(50));
	}
}
