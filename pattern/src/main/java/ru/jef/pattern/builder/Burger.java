package ru.jef.pattern.builder;

/**
 * Created by plotnikov on 23.11.2016.
 */
public abstract class Burger implements Item {

  @Override
  public Packing packing() {
    return new Wrapper();
  }

  @Override
  public abstract float price();
}
