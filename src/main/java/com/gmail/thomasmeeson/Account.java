package com.gmail.thomasmeeson;

import java.util.Date;
import java.util.UUID;

public class Account {

    private double balance;
    private String forename, surname, title;
    private UUID accountId;
    private Date creationDate;

    public Account(String forename, String surname, String title, double balance) {
        this.balance = balance;
        this.forename = forename;
        this.surname = surname;
        this.title = title;

        this.accountId = UUID.randomUUID();
        this.creationDate = new Date();
    }

    public Account(String forename, String surname, String title) {
        this.forename = forename;
        this.surname = surname;
        this.title = title;

        this.accountId = UUID.randomUUID();
        this.creationDate = new Date();
        this.balance = 0.0d;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
