package ru.jef.pattern.facade;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class Square implements Shape {
  @Override
  public void draw() {
    System.out.println("Square::draw()");
  }
}
