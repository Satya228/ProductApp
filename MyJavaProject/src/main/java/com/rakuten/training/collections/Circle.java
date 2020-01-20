package com.rakuten.training.collections;
import java.util.List;


public class Circle {
	
		double radius;
		
		public Circle(double radius)
		{
			super();
			this.radius=radius;
		}
		
		public double area()
		{
			return Math.PI*radius*radius;
		}
		
		public double getRadius()
		{
			return radius;
		}
		
		public void setRadius(double radius)
		{
			this.radius=radius;
		}



}
