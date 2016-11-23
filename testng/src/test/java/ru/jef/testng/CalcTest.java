package ru.jef.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class CalcTest {
  private Calc calc = new Calc();

  @Test
  public void testSum() throws Exception {
    Assert.assertEquals(5, calc.sum(2,3));
  }




  @Test(dataProvider = "testDataProvider", enabled = false)
  public void testSum(TestData testData){
    Assert.assertEquals(testData.getExSumm(), calc.sum(testData.getX(),testData.getY()));
  }

  @DataProvider
  public Iterator<Object[]> testDataProvider(){
    List<TestData> testDatas = new ArrayList<TestData>();
    testDatas.add(new TestData().withX(1).withY(2).withExSumm(3));
    testDatas.add(new TestData().withX(-2).withY(-2).withExSumm(-4));
    testDatas.add(new TestData().withX(3).withY(2).withExSumm(5));
    return testDatas.stream().map((g) -> new Object[]{g}).collect(Collectors.toList()).iterator();
  }

}
