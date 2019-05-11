package com.gmail.thomasmeeson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Core {

    public static void main(String[] args) {

//        GsonBuilder builder = new GsonBuilder();
//        builder.setPrettyPrinting();
//        builder.serializeNulls();
//        Gson gson = builder.create();

        Account account = new Account("Tom", "Meeson", "Mr", 0);
//        System.out.println(gson.toJson(account));

    }

    public static void writeOutput() {
        try{
            Writer writer = new FileWriter("out.json");

            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.setPrettyPrinting();
            Gson gson = gsonBuilder.create();

        } catch (IOException e) {
            System.out.println("IO Exception occurred");
            e.printStackTrace();
        }
    }
}
