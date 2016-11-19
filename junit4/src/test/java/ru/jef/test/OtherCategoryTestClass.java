package ru.jef.test;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by Fedor on 19.11.2016.
 */
public class OtherCategoryTestClass {

  @Category(Unit.class)
  @Test
  public void test1() {
    System.out.println("test1 with Category Unit");
  }
  @Category(UnitB.class)
  @Test
  public void test2() {
    System.out.println("test2 with Category UnitB");
  }
  @Category({Unit.class, UnitB.class})
  @Test
  public void test3() {
    System.out.println("test3 with Category Unit and UnitB");
  }
}
