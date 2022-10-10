package com.overloading;

public class Mobile {
 private void realme_Xt() {
System.out.println("Realme");
}
 private void realme_Xt(int price) {
	 System.out.println("Price:"+price);
 }
 private void realme_Xt(int ram, String memory) {
	System.out.println("Memory:"+ram+" "+memory); 
 }
 private void realme_Xt(String camera) {
	 System.out.println("Camera:"+camera);
 }
 
 public static void main(String[] args) {
	Mobile m = new Mobile();
	m.realme_Xt();
	m.realme_Xt(15000);
	m.realme_Xt("64 MP");
	m.realme_Xt(6, "64GB");
}
}
