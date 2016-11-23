package ru.jef.testng;

import org.testng.annotations.Test;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class DemoDataProviderInOtherClass {

  @Test(dataProvider = "getParameters", dataProviderClass = DataProviderDemo.class)
  public void demoDataProvider(String expectedData, String testData){
    System.out.println(String.format("Expected data %s; Tested data %s" , expectedData , testData));
  }
}
