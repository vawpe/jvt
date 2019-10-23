package ru.stqa.jft.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.stqa.jft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

    @Test
    public void contactDeletionTest() {
        if (! app.getContactHelper().isThereContact()) {
            app.getContactHelper().createContact(new ContactData("Ed", "Testovich", "Testov",
                    "+79811234567", "test@test.ru", "test1"), true);
        }
        int before = app.getContactHelper().getContactsCount();
        app.getContactHelper().selectContact(before - 1);
        app.getContactHelper().deleteContact();
        app.getContactHelper().alertAccept();
        app.getContactHelper().returnToHomePage();
        int after = app.getContactHelper().getContactsCount();
        Assert.assertEquals(after, before - 1);
    }
}