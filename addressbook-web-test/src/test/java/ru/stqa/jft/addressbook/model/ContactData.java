package ru.stqa.jft.addressbook.model;

public class ContactData {
    private int id;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String mobileNumber;
    private final String firstEmail;
    private final String group;

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactData that = (ContactData) o;

        if (id != that.id) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        return lastName != null ? lastName.equals(that.lastName) : that.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    public ContactData(int id, String firstName, String middleName, String lastName, String mobileNumber, String firstEmail, String group) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.firstEmail = firstEmail;
        this.group = group;
    }

    public ContactData(String firstName, String middleName, String lastName, String mobileNumber, String firstEmail, String group) {
        this.id = 0;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
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
        return lastName;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
