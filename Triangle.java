package com.company.training.object.triangle.bean;

/* Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади, периметра и 
точки пересечения медиан.
*/

public class Triangle {
	
    private double sideA;
    private double sideB;
    private double sideC;
	private double perimeter;
	private double area;
	private double meridianPoint;
	
	public Triangle (double xA, double yA, double xB, double yB, double xC, double yC) {
		
		double a, b, c;
		
		a = Math.sqrt(Math.pow((xA - xB), 2) + Math.pow((yA - yB), 2));
		b = Math.sqrt(Math.pow((xA - xC), 2) + Math.pow((yA - yC), 2));
		c = Math.sqrt(Math.pow((xB - xC), 2) + Math.pow((yB - yC), 2));
		
		if((a + b) > c && (a + c) > b && (b + c) > a) {
			sideA = a;
			sideB = b;
			sideC = c;
		}
		else {
			System.out.println("Такой треугольник не существует");
		}
		
	}
	
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	
	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setMeridianPoint(double meridianPoint) {
		this.meridianPoint = meridianPoint;
	}
	
	public double getSideA() {
		return sideA;
	}
	
	public double getSideB() {
		return sideB;
	}
	
	public double getSideC() {
		return sideC;
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	public double getArea() {
		return area;
	}
	
	public double getMeridianPoint() {
		return meridianPoint;
	}

}
