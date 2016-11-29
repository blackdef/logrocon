package ru.jef.pageobject.tests;

import org.testng.annotations.Test;
import ru.jef.pageobject.model.GroupData;


public class AddGroupTest extends TestBase {

    @Test
    public void testAddGroup() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().creationGroup(new GroupData("qwe", "asd", "zxc"));

    }

}
