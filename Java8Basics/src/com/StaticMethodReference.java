package com;

import java.util.function.Function;
import java.util.function.Supplier;

public class StaticMethodReference {

	static void show() {
		System.out.println("Sarthak Patel");
	}

	static int add(int n1, int n2) {
		return n1 + n2;
	}

	static int sub(int n1, int n2) {
		return n1 - n2;
	}

	public static void main(String[] args) {
		Supplier s1 = () -> Math.random();
		Supplier s2 = Math::random;

		System.out.println(s1.get());
		System.out.println(s2.get());

		FunDemo1 f1 = () -> {
			show();
		};
		FunDemo1 f2 = StaticMethodReference::show;
		f1.display();
		f2.display();

		Function<Integer, Double> f3 = (n) -> {
			return Math.sqrt(n);
		};
		Function<Integer, Double> f4 = Math::sqrt;
		System.out.println(f3.apply(25));
		System.out.println(f4.apply(25));

		FunDemo4 f5 = (n1, n2) -> add(n1, n2);
		FunDemo4 f6 = StaticMethodReference::add;
		FunDemo4 f7 = StaticMethodReference::sub;
		System.out.println(f5.calci(10, 20));
		System.out.println(f6.calci(10, 20));
		System.out.println(f7.calci(52, 2));
	}
}
