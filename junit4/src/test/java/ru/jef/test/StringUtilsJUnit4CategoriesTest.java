package ru.jef.test;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by Fedor on 19.11.2016.
 */
public class StringUtilsJUnit4CategoriesTest {

  @Category(Unit.class)
  @Test
  public void testIsEmpty() {
    System.out.println("testIsEmpty with Category Unit");
  }
  @Category(UnitB.class)
  @Test
  public void testIsEmptyB() {
    System.out.println("testIsEmptyB with Category UnitB");
  }

}
