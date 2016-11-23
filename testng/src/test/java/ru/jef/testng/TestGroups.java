package ru.jef.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class TestGroups {

  @Test(groups={"unit1","integration"})
  public void testingMethod1() {
    System.out.println("testingMethod1 unit1 integration");
  }

  @Test(groups={"unit2","integration"})
  public void testingMethod2() {
    System.out.println("testingMethod2 unit2 integration");
  }

  @Test(groups={"unit1"})
  public void testingMethod3() {

    System.out.println("testingMethod3 unit1");
    //Assert.assertFalse(true);
  }

  @Test(groups={"unit1", "unit2"})
  public void testingMethod4() {
    System.out.println("testingMethod4 unit1 unit2");
  }

}
