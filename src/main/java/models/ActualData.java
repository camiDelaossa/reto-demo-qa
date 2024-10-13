package models;

public class ActualData {

    private String fullName;
    private String email;
    private String currentAddress;
    private String permanentAddress;

    public ActualData(String fullName, String email, String currentAddress, String permanentAddress) {
        this.fullName = fullName;
        this.email = email;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getEmail() {
        return email;
    }



}
