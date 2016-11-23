package ru.jef.pattern.builder;

/**
 * Created by plotnikov on 23.11.2016.
 */
public interface Item {
  public String name();
  public Packing packing();
  public float price();
}
