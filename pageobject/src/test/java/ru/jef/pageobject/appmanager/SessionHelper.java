package ru.jef.pageobject.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Fedor on 28.11.2016.
 */
public class SessionHelper extends BaseHelper{

  public SessionHelper(FirefoxDriver wd) {
    super(wd);
  }
  public void login(String login, String password) {
    type(By.name("user"),login);
    type(By.name("pass"),password);
    click(By.xpath("//form[@id='LoginForm']/input[3]"));
  }
}
