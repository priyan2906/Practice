package com.overriding;

public class Processor extends Laptop {
@Override
public void lap() {
	System.out.println("Intel");
		super.lap();
}
public static void main(String[] args) {
	Processor p = new Processor();
	p.lap();
}
}
