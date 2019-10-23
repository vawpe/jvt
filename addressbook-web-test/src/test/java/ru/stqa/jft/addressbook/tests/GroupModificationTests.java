package ru.stqa.jft.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.stqa.jft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

    @Test
    public void groupModificationTest() {
        app.getNavigationHelper().goToGroupPage();
        int before = app.getGroupHelper().getGroupsCount();
        if (! app.getGroupHelper().isThereGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
        }
        app.getGroupHelper().selectGroup(before - 1);
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("modGroup1", "modGroup2", "modGroup3"));
        app.getGroupHelper().updateGroupModification();
        app.getGroupHelper().returnToGroupPage();
        int after = app.getGroupHelper().getGroupsCount();
        Assert.assertEquals(after, before);
    }
}
