package com;

public class Runner {
	public static void main(String[] args) {

		FunDemo1 f1 = () -> {
			System.out.println("Sarthak");
		};
		f1.display();
		
		FunDemo1 f2 = () -> {
			System.out.println("Patel");
		};
		f2.display();
		
		FunDemo2 f3=(a,b)->{System.out.println("sum = "+(a+b));};
		f3.show(10, 20);
		
		FunDemo3 f4=()->"Sarthak"+86;
		System.out.println(f4.display());
	}
}
