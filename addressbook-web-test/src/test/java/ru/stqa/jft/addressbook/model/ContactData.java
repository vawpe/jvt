package ru.stqa.jft.addressbook.model;

public class ContactData {
    private final String firstName;
    private final String middleName;
    private final String lastFamily;
    private final String mobileNumber;
    private final String firstEmail;
    private String group;

    public ContactData(String firstName, String middleName, String lastName, String mobileNumber, String firstEmail, String group) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastFamily = lastName;
        this.mobileNumber = mobileNumber;
        this.firstEmail = firstEmail;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastFamily;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getFirstEmail() {
        return firstEmail;
    }

    public String getGroup() {
        return group;
    }
}
