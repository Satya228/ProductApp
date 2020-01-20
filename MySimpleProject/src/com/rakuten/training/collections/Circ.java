package com.rakuten.training.collections;
import java.util.*;
	public class Circ {

		public List<Circle> buildCircleList() {
			List<Circle> circleList = new ArrayList<>();
			while (true) {
				double r = Math.random();
				if (r < 0.01) {
					break;
				}
				Circle aCircle = new Circle(r);
				circleList.add(aCircle);
			}
			return circleList;
		}

		public void removeSmallCircles(List<Circle> circles) {
			Iterator<Circle> it = circles.iterator();

			while (it.hasNext()) {
				Circle c = it.next();
				if (c.getRadius() < 0.5) {
					it.remove();
				}
			}
		}

		public static void main(String[] args) {
			Circ demo = new Circ();
			List<Circle> circles =  demo.buildCircleList();
			System.out.println("There are " + circles.size() + " circles.");

			demo.removeSmallCircles(circles);

			System.out.println("There are " + circles.size() + " circles.");

		}

	}

		