package ru.stqa.jft.addressbook;

import org.junit.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void groupDeletionTest() {
        goToGroupPage();
        selectGroup();
        deleteGroup();
        returnToGroupPage();
    }
}
