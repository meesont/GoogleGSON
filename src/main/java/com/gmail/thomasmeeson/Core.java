package com.gmail.thomasmeeson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class Core {

    public static void main(String[] args) {


        Account account = new Account("Tom", "Meeson", "Mr", 0);
        Account account1 = new Account("Sam", "Smith", "Sir", 100000);
        Account[] accounts = {account,account1};


        //writeOutput(accounts, "output");

        readInput("output");
    }

    public static void writeOutput(Object obj, String fileName) {
        try{
            Writer writer = new FileWriter(fileName + ".json");

            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.setPrettyPrinting();
            Gson gson = gsonBuilder.create();

            writer.write(gson.toJson(obj));
            System.out.println("Successfully wrote to file: " + fileName + ".json");
            writer.close();

        } catch (IOException e) {
            System.out.println("IO Exception occurred");
            e.printStackTrace();
        }
    }

    public static void readInput(String fileName) {

        Gson gson = new Gson();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(fileName + ".json"));

            Result result = gson.fromJson(br, Result.class);

            if(result != null) {
                for(Account a : result.getAccounts()) {
                    System.out.println(
                            "Account Details\n\n"
                                    + "Surname: " + a.getSurname() + "\n"
                                    + "Forename: " + a.getForename() + "\n"
                                    + "UUID: " + a.getAccountId());
                    System.out.println("----------------------");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File: " + fileName + ".json was not found");
        } finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void readInput(String fileName, String extension) {

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(fileName + extension));


        } catch (FileNotFoundException e) {
            System.out.println("File: "+ fileName +" not found");
//            e.printStackTrace();

        }

    }
}
