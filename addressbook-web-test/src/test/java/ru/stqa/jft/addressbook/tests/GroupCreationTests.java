package ru.stqa.jft.addressbook.tests;

import org.junit.Test;
import ru.stqa.jft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void groupCreationTest() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", null, null));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }
}
