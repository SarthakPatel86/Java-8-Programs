package com;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerRunner {

	public static void main(String[] args) {
		Consumer<String> c1=(n)->{System.out.println("Hello : "+n);};
		c1.accept("sarthak");
		
		Consumer<Integer> c2=(n)->{System.out.println("Hello : "+n);};
		c2.accept(86);
		
		Consumer c3=(n)->{System.out.println("Hello : "+n);};//without generic object
		c3.accept('A');
		
		BiConsumer<Integer, Integer> c4=(n1,n2)->{System.out.println("sum : "+(n1+n2));};
		c4.accept(86, 14);
		
		BiConsumer c5=(n1,n2)->{System.out.println("sum : "+n1+n2);};//Without generic object
		c5.accept(86, "Home");
	}
}
