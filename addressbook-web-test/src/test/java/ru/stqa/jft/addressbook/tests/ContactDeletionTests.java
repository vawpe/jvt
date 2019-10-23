package ru.stqa.jft.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.stqa.jft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

    @Test
    public void contactDeletionTest() {
        int before = app.getContactHelper().getContactsCount();
        if (! app.getContactHelper().isThereContact()) {
            app.getContactHelper().createContact(new ContactData("Ed", "Testovich", "Testov",
                    "+79811234567", "test@test.ru", "test1"), true);
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().alertAccept();
        app.getContactHelper().returnToHomePage();
        int after = app.getContactHelper().getContactsCount();
        Assert.assertEquals(after, before - 1);
    }
}