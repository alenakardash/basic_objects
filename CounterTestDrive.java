package com.company.training.object;

public class CounterTestDrive {
	
	public static void main(String[] args) {
		
		Counter count = new Counter();
		
		count.setCount();
		
		count.getCount();
		
		count.setCount(200);
		
		count.getCount();
		
		count.setCount(35);
		
		count.getCount();
		
		count.increaseCount();
		
		count.getCount();
		
		count.decreaseCount();
		
		count.getCount();
		
		count.setCount(0);
		
		count.decreaseCount();
		
		count.increaseCount();
		
		count.getCount();
		
		count.setCount(100);
		
		count.increaseCount();
		
		count.decreaseCount();
		
		count.getCount();
		
	}

}
