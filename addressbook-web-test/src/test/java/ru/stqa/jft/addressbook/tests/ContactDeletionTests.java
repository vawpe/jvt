package ru.stqa.jft.addressbook.tests;

import org.junit.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void contactDeletionTest() {
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().alertAccept();
        app.getNavigationHelper().goToHomePage();
    }
}