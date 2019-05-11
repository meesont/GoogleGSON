package com.gmail.thomasmeeson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Core {

    public static void main(String[] args) {


        Account account = new Account("Tom", "Meeson", "Mr", 0);

        writeOutput(account, "output");

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
}
