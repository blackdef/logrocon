package ru.jef.pageobject.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.jef.pageobject.model.GroupData;

import java.util.ArrayList;
import java.util.List;

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

  public void selectGroup(int index) {
    WebElement element = wd.findElements(By.name("selected[]")).get(index);
    if (!element.isSelected()) {
      element.click();
    }
  }

  public void creationGroup(GroupData group) {
    initGroupCreation();
    fillGroupForm(group);
    submitGroupCreation();
    returnGroupPage();
  }

  public boolean isThereAGroups() {
    try
    {
      wd.findElement(By.name("selected[]"));
      return true;
    }
    catch (NoSuchElementException ex)
    {
      return false;
    }


  }

  public List<GroupData> getGroupList() {
    List<GroupData> groups = new ArrayList<GroupData>();
    for (WebElement element : wd.findElements(By.cssSelector("span.group"))){
      String name = element.getText();
      int id = Integer.parseInt(element.findElement(By.name("selected[]")).getAttribute("value"));
      groups.add(new GroupData(id, name, null, null));
    }
    return groups;
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }
}
