package ru.stqa.jft.addressbook.appmanager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.jft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void submitContactCreation() {
        click(By.cssSelector("input:nth-child(87)"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("mobile"), contactData.getMobileNumber());
        type(By.name("email"), contactData.getFirstEmail());

        if (creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementIsPresent(By.name("new_group")));
        }
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

    public void returnToHomePage() {
        click(By.linkText("home"));
    }

    public void submitContactModification() {
        click(By.xpath("//input[@value='Update'][2]"));
    }

    public void createContact(ContactData contact, boolean creation) {
        initContactCreation();
        fillContactForm(contact, creation);
        submitContactCreation();
        returnToHomePage();
    }

    public boolean isThereContact() {
        return isElementIsPresent(By.xpath("//span[@id='search_count' and text()!='0']"));
    }
}
