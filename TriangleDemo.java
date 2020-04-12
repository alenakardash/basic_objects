package com.company.training.object;

import com.company.training.object.triangle.bean.Triangle;
import com.company.training.object.triangle.logic.TriangleLogic;

public class TriangleDemo {
	
	public static void main(String[] args) {
		Triangle tr = new Triangle(1, 1, 7, 1, 1, 6);
		
		double perimeter;
		double area;
		
		TriangleLogic logic = new TriangleLogic();
		
		perimeter = logic.calcTrianglePerimeter(tr);
		
		area = logic.calcTriangleArea(tr);
		
		System.out.println(perimeter);
		
		System.out.println(area);
		
		
	}

}
