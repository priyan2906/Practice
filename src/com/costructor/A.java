package com.costructor;

public class A {
 public A() {
	 this(100);
	 System.out.println("Default");
 }
 public A(int value) {
	 this(150, "priyan");
	 System.out.println("Parameterized");
 }
 public A(int value,String a) {
	 System.out.println("parameterized");
 }
 public static void main(String[] args) {
	A a = new A();
}
}
