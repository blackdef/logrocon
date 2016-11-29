package ru.jef.po.tests;

import org.testng.annotations.Test;
import ru.jef.po.model.GroupData;

/**
 * Created by Fedor on 29.11.2016.
 */
public class GroupModificationTest extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("name11", "header11", "footer11"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnGroupPage();
  }
}
