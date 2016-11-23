package ru.jef.pattern.nullobject;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class RealCustomer extends AbstractCustomer{

  public RealCustomer(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public boolean isNil() {
    return false;
  }
}
