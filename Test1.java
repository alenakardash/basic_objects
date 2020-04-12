package com.company.training.object;

/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.
*/

public class Test1 {
	
	private int x;
	private int y;
	
	
	public void setX(int value) {
		x = value;
	}
	
	public void setY(int value) {
		y = value;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	public void printVariables(int x, int y) {
		System.out.print(" x = " + x);
		System.out.println(" y = " + y);
		
	}
	
	public void changeX(int _x) {
		x = _x;
	}
	
	public void changeY(int _y) {
		y = _y;
	}
	
	public int sum(int x, int y) {
		int sum = 0;
		sum = x + y;
		return sum;
	}
	
	public int findMax(int x, int y) {
		int max = 0;
		
		if(x > y) {
			max = x;
		}
		
		else if(x == y) {
			max = 0;
		}
		else {
			max = y;
		}
		
		return max;
	}

}
