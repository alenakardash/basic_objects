package com.company.training.object;

public class Test1TestDrive {
	
	public static void main(String[] args) {
		
		Test1 task = new Test1();
		
        task.setX(5);
        task.setY(3);
		
		task.printVariables(task.getX(), task.getY());
		
		task.changeX(50);
		task.changeY(100);
		
		task.printVariables(task.getX(), task.getY());
		
		int sum = task.sum(task.getX(), task.getY());
		
		System.out.println("sum = " + sum);
		
		int max = task.findMax(task.getX(), task.getY());
		
		System.out.println("max = " + max);
		
	}

}
