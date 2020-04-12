package com.company.training.object;

public class Test2TestDrive {
	
	public static void main(String[] args) {
	
	Test2 test1 = new Test2();
	
	System.out.println("a = " + test1.getA() + "; b = " + test1.getB());
	
	Test2 test2 = new Test2(10, 10);
	
	System.out.println("a = " + test2.getA() + "; b = " + test2.getB());
	
	test1.setA(20);
	test1.setB(30);
	
	System.out.println("a = " + test1.getA() + "; b = " + test1.getB());
	
	
	test2.setA(40);
	test2.setB(50);
	
	System.out.println("a = " + test2.getA() + "; b = " + test2.getB());

	}
}
