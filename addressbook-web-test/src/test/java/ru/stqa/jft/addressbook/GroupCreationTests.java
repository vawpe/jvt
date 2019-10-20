package ru.stqa.jft.addressbook;

import org.junit.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void groupCreationTest() {
        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test1", "test1"));
        submitGroupCreation();
        returnToGroupPage();
    }
}
