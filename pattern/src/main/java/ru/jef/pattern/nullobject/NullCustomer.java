package ru.jef.pattern.nullobject;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class NullCustomer extends AbstractCustomer{
  @Override
  public String getName() {
    return "Not Available in Customer Database";
  }

  @Override
  public boolean isNil() {
    return true;
  }
}
