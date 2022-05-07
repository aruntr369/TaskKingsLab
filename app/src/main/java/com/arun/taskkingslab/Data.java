package com.arun.taskkingslab;

public class Data {

    String client_name;
    String client_email;
    String client_mobile_number;

    public Data(String client_name, String client_email, String client_mobile_number) {
        this.client_name = client_name;
        this.client_email = client_email;
        this.client_mobile_number = client_mobile_number;
    }

    public String getClientName() {
        return client_name;
    }

    public void setClientName(String clientName) {
        client_name = clientName;
    }

    public String getClient_email() {
        return client_email;
    }

    public void setClient_email(String client_email) {
        this.client_email = client_email;
    }

    public String getClient_mobile_number() {
        return client_mobile_number;
    }

    public void setClient_mobile_number(String client_mobile_number) {
        this.client_mobile_number = client_mobile_number;
    }
}
