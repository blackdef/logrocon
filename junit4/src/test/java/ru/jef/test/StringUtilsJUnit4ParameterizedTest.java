package ru.jef.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fedor on 19.11.2016.
 */
@RunWith(Parameterized.class)
public class StringUtilsJUnit4ParameterizedTest {
  private final CharSequence testData;
  private final boolean expected;

  public StringUtilsJUnit4ParameterizedTest(final CharSequence testData, final boolean expected) {
    this.testData = testData;
    this.expected = expected;
  }

  @Test
  public void testIsEmpty() {
    final boolean actual = StringUtils.isEmpty(testData);
    assertEquals(expected, actual);
  }

  @Parameterized.Parameters
  public static List<Object[]> isEmptyData() {
    return Arrays.asList(new Object[][] {
            { null, true },
            { "", true },
            { " ", false },
            { "some string", false },
    });
  }

}
