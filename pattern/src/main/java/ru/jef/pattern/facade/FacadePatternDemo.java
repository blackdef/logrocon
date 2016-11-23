package ru.jef.pattern.facade;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class FacadePatternDemo {
  public static void main(String[] args) {
    ShapeMaker shapeMaker = new ShapeMaker();

    shapeMaker.drawCircle();
    shapeMaker.drawRectangle();
    shapeMaker.drawSquare();
  }
}
