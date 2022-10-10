package com.overriding;

public class Laptop {
public void lap() {
	System.out.println("DELL");
}public static void main(String[] args) {
	Laptop l = new Laptop();
	l.lap();
}
}
