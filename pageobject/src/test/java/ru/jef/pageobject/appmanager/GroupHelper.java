package ru.jef.pageobject.appmanager;

import org.omg.CORBA.ValueBaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.jef.pageobject.model.GroupData;

/**
 * Created by Fedor on 28.11.2016.
 */
public class GroupHelper extends BaseHelper {

  public GroupHelper(FirefoxDriver wd) {
    super(wd);

  }

  public void returnGroupPage() {
    click(By.linkText("group page"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void deleteGroup() {
    click(By.xpath("//div[@id='content']/form/input[5]"));
  }

  public void selectGroup() {
    if (!wd.findElement(By.name("selected[]")).isSelected()) {
      click(By.name("selected[]"));
    }
  }
}
