package ru.jef.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * Created by Fedor on 18.11.2016.
 */
public class TestWatcherEx {
  @Rule
  public TestWatcher watcher = new TestWatcher() {

    @Override
    protected void starting(Description description) {
      System.out.println("starting");
      //throw new IllegalStateException();
    }

    @Override
    protected void finished(Description description) {
      System.out.println("finished");
    }
  };

  @Test
  public void test() {
    System.out.println("test");
  }
}
