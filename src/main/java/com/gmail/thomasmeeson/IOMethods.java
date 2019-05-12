package com.gmail.thomasmeeson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class IOMethods {

    /**
     * Write an object to a file
     * @param obj Object to write
     * @param fileName File to write too
     * @deprecated Replaced by writeOutput(Object[] objs, String fileName)
     */
    public void writeOutput(Object obj, String fileName) {
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

    /**
     * Write an array of objects to a file
     * @param objs Object array to write
     * @param fileName File to write too
     */
    public void writeOutput(Object[] objs, String fileName){
        try {
            Writer writer = new FileWriter(fileName + ".json");

        } catch (IOException e) {
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
}
