package ru.jef.pattern.compositeentity;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class CompositeEntityPatternDemo {
  public static void main(String[] args) {

    Client client = new Client();
    client.setData("Test", "Data");
    client.printData();
    client.setData("Second Test", "Data1");
    client.printData();
  }
}
