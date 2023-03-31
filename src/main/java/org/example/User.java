package org.example;

public class User {

    private int id;
    private String email;
    private String sendStatus;

    public User(int id, String email, String sendStatus) {
        this.id = id;
        this.email = email;
        this.sendStatus = sendStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
    }
}
