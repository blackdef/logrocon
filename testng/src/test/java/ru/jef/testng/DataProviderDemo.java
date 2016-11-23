package ru.jef.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class DataProviderDemo {

  @DataProvider
  public Object[][] getParameters(){
    return new Object[][] {
            {"expectedData1","testData1"},
            {"expectedData2","testData2"},
            {"expectedData3","testData3"},
            {"expectedData4","testData4"},
    };
  }

  @Test(dataProvider = "getParameters")
  public void demoDataProvider(String expectedData, String testData){
    System.out.println(String.format("Expected data %s \nTested data %s" , expectedData , testData));
  }
}
