package ru.stqa.jft.addressbook.tests;

import org.junit.Test;

public class GroupModificationTests extends TestBase {

    @Test
    public void groupModificationTest() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().updateGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
