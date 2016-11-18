package ru.jef.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

/**
 * Created by Fedor on 19.11.2016.
 */
public class TestTimeoutRule {
  @Rule
  public TestRule timeout = new Timeout(1000);

  @Test
  public void test() throws Exception {
    System.out.println("test");
    Thread.sleep(500);
  }

  @Test
  public void test2() throws Exception {
    System.out.println("test2");
    Thread.sleep(1500);
  }
}
