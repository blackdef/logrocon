package ru.jef.test;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fedor on 19.11.2016.
 */
@RunWith(Theories.class)
public class StringUtilsJUnit4TheoryTest {

  @DataPoints
  public static Object[][] isEmptyData = new Object[][] {
          { "", true },
          { " ", false }
  };


  @DataPoint
  public static Object[] nullData = new Object[] { null, true };
  @DataPoint
  public static Object[] fullData = new Object[] { "some string", false };


  @Theory
  public void testEmpty( Object... testData) {
    final boolean actual = StringUtils.isEmpty((CharSequence) testData[0]);
    assertEquals(testData[1], actual);
  }
}
