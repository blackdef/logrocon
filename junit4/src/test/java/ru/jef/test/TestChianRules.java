package ru.jef.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * Created by Fedor on 19.11.2016.
 */
public class TestChianRules {
  @Rule
  public TestRule chain= RuleChain
          .outerRule(new SimplePrintRule("log rule"))
          .around(new SimplePrintRule("connect rule"))
          .around(new SimplePrintRule("some other rule"));

  @Test
  public void test() {
    System.out.println("test");
  }

  public class SimplePrintRule extends TestWatcher {
    private String name;

    public SimplePrintRule(String name) {
      this.name = name;
    }

    @Override
    protected void starting(Description description) {
      System.out.println("starting " + name);
    }

    @Override
    protected void finished(Description description) {
      System.out.println("finished " + name);
    }
  }
}
