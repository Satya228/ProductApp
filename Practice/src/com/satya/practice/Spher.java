package com.satya.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Spher {
	
	public List<Sphere> buildSpheresList()
	{
		List<Sphere> sphereList = new ArrayList<>();
		
		while(true)
		{
			double r = Math.random();
			if (r< 0.01)
			{
				break;
			}
			else
			{
				Sphere aSphere = new Sphere(r);
				sphereList.add(aSphere);
				
			}
			return sphereList;
		}
			
	}	
			
			

		public static void removeSmallSpheres(List<Sphere> spheres)
		{
			Iterator<Sphere> it = Sphere.iterator();
			while(it.hasNext())
			{
				Sphere c =it.next();
				
				if(c.getRadius()<0.5)
				{
					it.remove();
				}
			}
		}
		
		

  public static void main(String[] args) {
	  Sphere = new Sphere();
		List<Sphere> spheres =  buildSpheresList();
		System.out.println("There are " + spheres.size() + " spheres.");

		removeSmallSpheres(spheres);

		System.out.println("There are " + spheres.size() + " spheres.");

	 
  
  
}
}