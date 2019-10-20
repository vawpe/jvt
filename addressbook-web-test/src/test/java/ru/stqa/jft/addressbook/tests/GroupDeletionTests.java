package ru.stqa.jft.addressbook.tests;

import org.junit.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void groupDeletionTest() {
        app.goToGroupPage();
        app.selectGroup();
        app.deleteGroup();
        app.returnToGroupPage();
    }
}
