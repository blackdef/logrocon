package ru.jef.pattern.builder;

/**
 * Created by plotnikov on 23.11.2016.
 */
public abstract class ColdDrink implements Item {
  @Override
  public Packing packing() {
    return new Bottle();
  }

  @Override
  public abstract float price();
}
