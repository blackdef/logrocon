package ru.jef.test;

import org.junit.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Fedor on 18.11.2016.
 */
public class StringUtilsJUnit4Test extends Assert{

  private  Map<String, byte[]> toHexStringData = new HashMap<String, byte[]>();

  @Before
  public void setUpToHexStringData() {
    toHexStringData.put("", new byte[0]);
    toHexStringData.put("01020d112d7f", new byte[]{1,2,13,17,45,127});
    toHexStringData.put("00fff21180"  , new byte[]{0,-1,-14,17,-128});
    System.out.println(" setUpToHexStringData ");
  }

  @After
  public void tearDownToHexStringData() {
    toHexStringData.clear();
    System.out.println(" tearDownToHexStringData ");
  }

  @Test
  public void testToHexString() {
    for (Map.Entry<String, byte[]> entry : toHexStringData.entrySet())
    {
      final byte[] testData = entry.getValue();
      final String expected = entry.getKey();
      final String actual = StringUtils.toHexString(testData);
      assertEquals(expected, actual);
    }
    System.out.println(" testToHexString ");
  }

  @Test(expected = NullPointerException.class)
  public void testToHexStringWrong()
  {
    System.out.println(" befor exception testToHexStringWrong ");
    StringUtils.toHexString(null);
    //System.out.println(" after exception testToHexStringWrong ");
  }

//  @Ignore
  @Test(timeout = 1000)
  public void infinity(){
    System.out.println(" befor while infinity ");
    while(true);
  }
}
