package ru.jef.test;

import org.junit.*;

/**
 * Created by Fedor on 18.11.2016.
 */
public class TestJUnit4Rules {
  @BeforeClass
  public static void beforClassSetUp(){
    System.out.println("beforClassSetUp");
  }

  @Before
  public void beforSetUo(){
    System.out.println("beforSetUp");
  }

  @AfterClass
  public static void afterClassTearDown(){
    System.out.println("afterClassTearDown");
  }

  @After
  public void afterTearDown(){
    System.out.println("afterTearDown");
  }

  @Test
  public void test1(){
    System.out.println("test1");
  }

  @Test
  public void test2(){
    System.out.println("test2");
  }

}
