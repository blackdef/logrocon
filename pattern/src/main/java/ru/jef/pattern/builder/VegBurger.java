package ru.jef.pattern.builder;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class VegBurger extends Burger {
  @Override
  public String name() {
    return "Veg Burger";
  }

  @Override
  public float price() {
    return 25.0f;
  }
}
