package ru.jef.pageobject.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Fedor on 28.11.2016.
 */
public class NavigationHelper extends BaseHelper{


  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }


  public void gotoGroupPage() {
      click(By.linkText("groups"));
  }
}
