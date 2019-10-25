package ru.stqa.jft.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.stqa.jft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase {

    @Test
    public void contactDeletionTest() {
        if (! app.getContactHelper().isThereContact()) {
            app.getContactHelper().createContact(new ContactData("Ed", "Testovich", "Testov",
                    "+79811234567", "test@test.ru", "test1"), true);
        }
        List<ContactData> before = app.getContactHelper().getContactsList();
        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().deleteContact();
        app.getContactHelper().alertAccept();
        app.getContactHelper().returnToHomePage();
        List<ContactData> after = app.getContactHelper().getContactsList();
        Assert.assertEquals(after.size(), before.size() - 1);
        before.remove(before.size() - 1);
        Assert.assertEquals(before, after);
    }
}