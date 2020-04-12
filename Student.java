package com.company.training.object;

/* Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). Создайте массив 
из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
*/

public class Student {
	
	 private String lastName;
	 private String firstName;
	 private int groupNumber;
	 private int[] marks = new int[5];
	
	
	public Student(String lastName, String firstName, int groupNumber, int[] marks) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.groupNumber = groupNumber;
		this.marks = marks;
	}
	
	public Student() {
		
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}
	
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public int getGroupNumber() {
		return groupNumber;
	}
	
	public int[] getMarks() {
		return marks;
	}

}
