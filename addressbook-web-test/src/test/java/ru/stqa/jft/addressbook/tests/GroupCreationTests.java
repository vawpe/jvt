package ru.stqa.jft.addressbook.tests;

import org.junit.Test;
import ru.stqa.jft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void groupCreationTest() {
        app.goToGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("test1", "test1", "test1"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }
}
