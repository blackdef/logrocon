package ru.jef.test;

import junit.framework.Test;
import junit.framework.TestSuite;
import ru.jef.test.OtherTest1;
import ru.jef.test.OtherTest2;

/**
 * Created by plotnikov on 18.11.2016.
 */
public class StringUtilsJUnit3TestSuite extends TestSuite {

  public static Test suite() {
    final TestSuite s = new TestSuite();
    s.addTestSuite(OtherTest2.class);
    s.addTestSuite(OtherTest1.class);
    return s;
  }


}


