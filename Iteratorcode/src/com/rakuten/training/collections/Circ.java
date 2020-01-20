package com.rakuten.training.collections;

import java.util.List;

public class Circ {
	public static List<Circle> buildCircleList()
	{
		List<Circle>circleList=new Arraylist();
		while(true)
		{
			double r= Math.random();
			if(r<0.01)
			{
				break;
				
			}
			Circle aCircle=new Circle(r);
			Circle List.add(aCircle);
			
			
		}
		return CircleList;
		
	}
	public static removeSmallCircles(List<Circle> circles)
	{
		Iterator<circle>it=circles.iterator();
		while(it.hasNext())
			Circle c =it.next();
		if(c.getRadius()<0.5)
		{
			it.remove();
			
		}
	}

}


public static void main(String[]args)
{
List<Circle> circles = buildCircleList();
System.out.println("There are "+circles.size()+"circles");
for(Circle c : circles) { System.out.println(c.area()); }
removeSmallCircles(circles);
System.out.println("there are "+circles.size()+"circles");
}
}
