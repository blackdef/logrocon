package ru.jef.po.tests;

import org.testng.annotations.Test;
import ru.jef.po.model.GroupData;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {

        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("name", "header", "footer"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnGroupPage();
    }

}
