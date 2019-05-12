package com.gmail.thomasmeeson.v1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.Date;
import java.util.UUID;

@Generated("jsonschema2pojo")
public class Account {

    @SerializedName("balance")
    @Expose
    private Double balance;
    @SerializedName("forename")
    @Expose
    private String forename;
    @SerializedName("surname")
    @Expose
    private String surname;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("accountId")
    @Expose
    private UUID accountId;
    @SerializedName("creationDate")
    @Expose
    private Date creationDate;


    /**
     * A constructor for the account class, when the balance is known
     * @param forename The forename of the account holder
     * @param surname The surname of the account holder
     * @param title The title of the account holder
     * @param balance The starting balance of the account
     */
    public Account(String forename, String surname, String title, double balance) {
        this.balance = balance;
        this.forename = forename;
        this.surname = surname;
        this.title = title;

        this.accountId = UUID.randomUUID();
        this.creationDate = new Date();
    }

    /**
     * A constructor for the account class, when the balance is unknown
     * @param forename The forename of the account holder
     * @param surname The surname of the account holder
     * @param title The title of the account holder
     */
    public Account(String forename, String surname, String title) {
        this.forename = forename;
        this.surname = surname;
        this.title = title;

        this.accountId = UUID.randomUUID();
        this.creationDate = new Date();
        this.balance = 0.0d;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
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