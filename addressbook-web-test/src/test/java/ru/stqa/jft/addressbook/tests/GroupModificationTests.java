package ru.stqa.jft.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.stqa.jft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

public class GroupModificationTests extends TestBase {

    @Test
    public void groupModificationTest() {
        app.getNavigationHelper().goToGroupPage();
        if (! app.getGroupHelper().isThereGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
        }
        List<GroupData> before = app.getGroupHelper().getGroupsList();
        app.getGroupHelper().selectGroup(before.size() - 1);
        app.getGroupHelper().initGroupModification();
        GroupData group = new GroupData(before.get(before.size() - 1).getGroupId(),"modGroup1", "modGroup2", "modGroup3");
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().updateGroupModification();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupsList();
        Assert.assertEquals(after.size(), before.size());
        before.remove(before.size() - 1);
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}
