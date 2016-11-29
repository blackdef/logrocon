package ru.jef.pageobject.tests;

import org.testng.annotations.Test;
import ru.jef.pageobject.model.GroupData;


public class AddGroupTest extends TestBase {

    @Test
    public void testAddGroup() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("qwe", "asd", "zxc"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnGroupPage();
    }

}
