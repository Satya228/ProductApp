package com.satya.practice;
import java.util.Iterator;
import java.util.List;



public class Sphere {
	double radius;
	
	public Sphere(double radius)
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
		
	 static Iterator<Sphere> iterator() {
    // TODO Auto-generated method stub
    return null;
  }
}
