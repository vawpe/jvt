package ru.stqa.jft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.jft.addressbook.model.ContactData;

public class ContactHelper {

    private WebDriver driver;

    public ContactHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void submitContactCreation() {
        driver.findElement(By.cssSelector("input:nth-child(87)")).click();
    }

    public void fillContactForm(ContactData contactData) {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys(contactData.getFirstName());
        driver.findElement(By.name("middlename")).click();
        driver.findElement(By.name("middlename")).sendKeys(contactData.getMiddleName());
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys(contactData.getLastFamily());
        driver.findElement(By.name("mobile")).click();
        driver.findElement(By.name("mobile")).sendKeys(contactData.getMobileNumber());
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys(contactData.getFirstEmail());
    }

    public void initContactCreation() {
        driver.findElement(By.linkText("add new")).click();
    }
}
