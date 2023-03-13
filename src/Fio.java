public class Fio {
    private String firstName;
    private String middleName;
    private String surName;

    public Fio(String firstName, String middleName, String sureName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.surName = sureName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSureName() {
        return surName;
    }

    public void setSureName(String sureName) {
        this.surName = sureName;
    }

    @Override
    public String toString() {
        return surName + " " + firstName + " " + middleName ;
    }
}
