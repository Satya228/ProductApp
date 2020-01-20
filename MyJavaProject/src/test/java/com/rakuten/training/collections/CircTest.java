package com.rakuten.training.collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CircTest {

  @Test
  public void testBuildCirclesList() {
    // Arrange
    Circ objUnderTest = new Circ();
    // Act
    List<Circle> circles = objUnderTest.buildCircleList();
    // Assert
    assertNotNull(circles);
  }

  @Test
  public void RemoveSmallCircles_Removes_Small_Circles_IfPresent() {
    // Arrange
    Circ objectUnderTest = new Circ();
    List<Circle> paramToBePassed = new ArrayList<Circle>();
    paramToBePassed.add(new Circle(1.0));
    paramToBePassed.add(new Circle(0.75));
    paramToBePassed.add(new Circle(0.5));
    paramToBePassed.add(new Circle(0.4));
    int originalSize = paramToBePassed.size();
    int expectedSize = originalSize - 1;

    // Act
    objectUnderTest.removeSmallCircles(paramToBePassed);

    // Assert
    int actualSize = paramToBePassed.size();
    assertEquals(expectedSize, actualSize);
  }

  @Test
  public void RemoveSmallCircles_Removes_Nothing_IfAbsent() {
    // Arrange
    Circ objectUnderTest = new Circ();
    List<Circle> paramToBePassed = new ArrayList<Circle>();
    paramToBePassed.add(new Circle(1.0));
    paramToBePassed.add(new Circle(0.75));
    paramToBePassed.add(new Circle(0.5));
    paramToBePassed.add(new Circle(0.8));
    int originalSize = paramToBePassed.size();
    int expectedSize = originalSize;

    // Act
    objectUnderTest.removeSmallCircles(paramToBePassed);

    // Assert
    int actualSize = paramToBePassed.size();
    assertEquals(expectedSize, actualSize);
  }
}
