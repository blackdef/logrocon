package ru.jef.pageobject.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.jef.pageobject.model.GroupData;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Fedor on 29.11.2016.
 */
public class ModifyGroupTest extends TestBase {

  @Test
  public void testModificationGroup(){
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroups()){
      app.getGroupHelper().creationGroup(new GroupData("CreationGroup",null,null));
    }

    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroup(before.size() - 1);
    app.getGroupHelper().initGroupModification();
    GroupData group = new GroupData(before.get(before.size()-1).getId(), "Name","Header","Footer");
    app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size());

    before.remove(before.size() - 1);
    before.add(group);
    Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(after, before);




  }
}
