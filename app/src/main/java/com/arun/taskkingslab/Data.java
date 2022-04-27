package com.arun.taskkingslab;

public class Data {

    String ClientName;
    String Email;
    String PhoneNumber;

    public Data(String clientName, String email, String phoneNumber) {
        ClientName = clientName;
        Email = email;
        PhoneNumber = phoneNumber;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
