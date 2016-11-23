package ru.jef.pattern.facade;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Rectangle::draw()");
  }
}
