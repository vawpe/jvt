package ru.stqa.jft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.jft.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getGroupName());
        type(By.name("group_header"), groupData.getGroupHeader());
        type(By.name("group_footer"), groupData.getGroupFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteGroup() {
        click(By.xpath("//input[@name='delete'][2]"));
    }

    public void selectGroup(int index) {
        driver.findElements(By.name("selected[]")).get(index).click();
    }

    public void initGroupModification() {
        click(By.xpath("//input[@value='Edit group'][2]"));
    }

    public void updateGroupModification() {
        click(By.xpath("//input[@name='update']"));
    }

    public void createGroup(GroupData group) {
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
        returnToGroupPage();
    }

    public boolean isThereGroup() {
        return isElementIsPresent(By.name("selected[]"));
    }

    public int getGroupsCount() {
        return driver.findElements(By.name("selected[]")).size();
    }

    public List<GroupData> getGroupsList() {
        List<GroupData> groups = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.xpath("//span[@class='group']"));
        for (WebElement element : elements) {
            String groupName = element.getText();
            int groupId = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            GroupData group = new GroupData(groupId, groupName, null, null);
            groups.add(group);
        }
        return groups;
    }
}
