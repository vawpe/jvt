package ru.stqa.jft.addressbook;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class TestBase {
    JavascriptExecutor js;
    private WebDriver driver;
    private Map<String, Object> vars;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        login("admin", "secret");
    }

    private void login(String username, String password) {
        driver.get("http://localhost/addressbook/index.php");
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    protected void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    protected void submitGroupCreation() {
        driver.findElement(By.name("submit")).click();
    }

    protected void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).sendKeys(groupData.getGroupName());
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getGroupHeader());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getGroupFooter());
    }

    protected void initGroupCreation() {
        driver.findElement(By.name("new")).click();
    }

    protected void goToGroupPage() {
        driver.findElement(By.linkText("groups")).click();
    }

    protected void deleteGroup() {
        driver.findElement(By.cssSelector("input:nth-child(11)")).click();
    }

    protected void selectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }

    protected void submitContactCreation() {
        driver.findElement(By.cssSelector("input:nth-child(87)")).click();
    }

    protected void fillContactForm(ContactData contactData) {
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

    protected void initContactCreation() {
        driver.findElement(By.linkText("add new")).click();
    }
}
