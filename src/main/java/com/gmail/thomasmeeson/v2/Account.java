package com.gmail.thomasmeeson.v2;

import java.util.Date;
import java.util.UUID;

public class Account {

    private double balance;
    private Date creationDate;
    private String forename, surname;
    private UUID accountId;

    public Account() {
    }

    public Account(Double balance, String forename, String surname) {
        this.balance = balance;
        this.forename = forename;
        this.surname = surname;

        this.creationDate = new Date();
        this.accountId = UUID.randomUUID();
    }

    public Account(String forename, String surname) {
        this.forename = forename;
        this.surname = surname;

        this.balance = 0.0d;
        this.accountId = UUID.randomUUID();
        this.creationDate = new Date();
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

    public Date getCreationDate() {
        return creationDate;
    }

    public UUID getAccountId() {
        return accountId;
    }
}
