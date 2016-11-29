package ru.jef.po.tests;

import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase {

    @Test
    public void testDeleteGroup() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnGroupPage();
    }


}
