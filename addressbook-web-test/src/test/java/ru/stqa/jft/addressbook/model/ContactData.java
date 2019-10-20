package ru.stqa.jft.addressbook.model;

public class ContactData {
    private final String firstName;
    private final String middleName;
    private final String lastFamily;
    private final String mobileNumber;
    private final String firstEmail;

    public ContactData(String firstName, String middleName, String lastFamily, String mobileNumber, String firstEmail) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastFamily = lastFamily;
        this.mobileNumber = mobileNumber;
        this.firstEmail = firstEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastFamily() {
        return lastFamily;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getFirstEmail() {
        return firstEmail;
    }
}
