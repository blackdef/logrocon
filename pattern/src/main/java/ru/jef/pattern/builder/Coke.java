package ru.jef.pattern.builder;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class Coke extends ColdDrink {
  @Override
  public String name() {
    return "Coke";
  }

  @Override
  public float price() {
    return 30.0f;
  }
}
