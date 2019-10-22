package ru.stqa.jft.addressbook.tests;

import org.junit.Test;
import ru.stqa.jft.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase {

    @Test
    public void groupDeletionTest() {
        app.getNavigationHelper().goToGroupPage();
        if (! app.getGroupHelper().isThereGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnToGroupPage();
    }
}
