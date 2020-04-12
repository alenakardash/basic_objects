package com.company.training.object;

/* Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне. 
Предусмотритеинициализацию счетчика значениями по умолчанию и произвольными значениями.Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
*/

public class Counter {

	private int min = 0;
	private int max = 100;

	private int count;

	public void setCount() {
		count = min;
	}

	public void setCount(int count) {
		if (count >= min && count <= max) {
			this.count = count;
		} else {
			System.out.println("Значение не попадает в диапазон 0 - 100");
		}

	}

	public void increaseCount() {
		if (count + 1 > max) {
			count = 100;
			System.out.println("Невозможно увеличить значение счетчика - превышен максимальный диапазон");
		} else {
			count++;
		}
	}

	public void decreaseCount() {
		if (count - 1 < min) {
			count = 0;
			System.out.println("Невозможно уменьшить значение счетчика - полученное значение < 0");
		} else {
			count--;
		}
	}
	
	public void getCount() {
		System.out.println("Count = " + count);
	}
}
