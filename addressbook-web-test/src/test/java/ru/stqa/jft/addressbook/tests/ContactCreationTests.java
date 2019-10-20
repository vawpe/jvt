package ru.stqa.jft.addressbook.tests;// Generated by Selenium IDE

import org.junit.Test;
import ru.stqa.jft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void contactCreationTest() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Ed", "Testovich", "Testov",
                "+79811234567", "test@test.ru"));
        app.getContactHelper().submitContactCreation();
    }
}
