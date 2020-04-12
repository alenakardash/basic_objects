package com.company.training.object.triangle.logic;

import com.company.training.object.triangle.bean.Triangle;

public class TriangleLogic {
	
	public double calcTrianglePerimeter(Triangle tr) {
		double perimeter;
		perimeter = tr.getSideA() + tr.getSideB() + tr.getSideC();
		return perimeter;
	}
	
	public double calcTriangleArea(Triangle tr) {
		double semiperimeter;
		semiperimeter = calcTrianglePerimeter(tr) / 2;
		
		double area;
		area = Math.sqrt(semiperimeter * (semiperimeter - tr.getSideA())*(semiperimeter - tr.getSideB())*(semiperimeter - tr.getSideC()));
		
		return area;
	}

}
