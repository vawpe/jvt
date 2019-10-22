package ru.stqa.jft.addressbook.tests;

import org.junit.Test;
import ru.stqa.jft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void contactModificationTest() {
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("testFirstName", "testMiddleName", "testLastName",
                "79819876543", "test2@email.test", null), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().goToHomePage();
    }
}
