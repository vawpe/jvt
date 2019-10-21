package ru.stqa.jft.addressbook.tests;

import org.junit.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void contactModificationTest() {
        app.getContactHelper().initContactModification();
        app.getContactHelper().updateContactModification();
        app.getNavigationHelper().goToHomePage();
    }
}
