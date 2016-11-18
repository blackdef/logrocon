package ru.jef.test;

import junit.extensions.RepeatedTest;
import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by plotnikov on 18.11.2016.
 */
public class StringUtilsJUnit3RepeatedTest extends RepeatedTest{
  public StringUtilsJUnit3RepeatedTest(Test test, int repeat) {
    super(test, repeat);
  }
  public StringUtilsJUnit3RepeatedTest() {
    super(new OtherTest1(), 10);
  }
  public static Test suite(){
    TestSuite suite = new TestSuite();
    RepeatedTest repeatedTest = new StringUtilsJUnit3RepeatedTest();
    suite.addTest(repeatedTest);
    return suite;

  }

}
