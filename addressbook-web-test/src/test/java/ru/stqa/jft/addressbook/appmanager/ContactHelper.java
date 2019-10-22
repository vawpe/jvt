package ru.stqa.jft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.jft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void submitContactCreation() {
        click(By.cssSelector("input:nth-child(87)"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("mobile"), contactData.getMobileNumber());
        type(By.name("email"), contactData.getFirstEmail());
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void selectContact() {
        click(By.xpath("(//input[@type='checkbox'])[1]"));
    }

    public void deleteContact() {
        click(By.xpath("//input[@type='button' and @value='Delete']"));
    }

    public void initContactModification() {
        click(By.xpath("(//img[@src='icons/pencil.png'])[1]"));
    }

    public void submitContactModification() {
        click(By.xpath("//input[@value='Update'][2]"));
    }
}
