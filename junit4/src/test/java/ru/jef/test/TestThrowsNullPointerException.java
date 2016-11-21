package ru.jef.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by Fedor on 18.11.2016.
 */
public class TestThrowsNullPointerException {

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void throwsNullPointerExceptionWithMessage() {
    System.out.println("test1");
    thrown.expect(NullPointerException.class);
    throw new NullPointerException("What happened?");
  }

  @Test(expected=NullPointerException.class)
  public void throwsNullPointerExceptionWithMessage2() {
    System.out.println("test2");
    throw new NullPointerException("Nothing");
  }
}
