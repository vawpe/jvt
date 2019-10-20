package ru.stqa.jft.addressbook.tests;

import org.junit.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void groupDeletionTest() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnToGroupPage();
    }
}
