package ru.jef.test;

import junit.extensions.ExceptionTestCase;

/**
 * Created by plotnikov on 18.11.2016.
 */
public class JUnit3StringUtilsExceptionTest extends ExceptionTestCase {

  public JUnit3StringUtilsExceptionTest(String name, Class exception) {
    super(name, exception);
  }
  public JUnit3StringUtilsExceptionTest(final String name) {
    super(name, NullPointerException.class);
  }

  public void testToHexString() {
    System.out.println("before test toHexString testToHexString");

    StringUtils.toHexString(null);
    System.out.println("after test toHexString testToHexString");
  }

}
