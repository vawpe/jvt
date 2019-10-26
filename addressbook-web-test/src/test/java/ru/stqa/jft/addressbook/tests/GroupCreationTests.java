package ru.stqa.jft.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.stqa.jft.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GroupCreationTests extends TestBase {

    @Test
    public void groupCreationTest() {
        app.getNavigationHelper().goToGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupsList();
        GroupData group = new GroupData("test1", null, null);
        app.getGroupHelper().createGroup(group);
        List<GroupData> after = app.getGroupHelper().getGroupsList();
        Assert.assertEquals(after.size(), before.size() + 1);

        int max= 0;
        for (GroupData g : after) {
            if (g.getGroupId() > max) {
                max = g.getGroupId();
            }
        }
        group.setGroupId(max);
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}
