package ru.jef.pageobject.tests;

import org.testng.annotations.Test;
import ru.jef.pageobject.model.GroupData;

import java.util.List;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion() {
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup(before.size() - 1);
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnGroupPage();
    }


}
