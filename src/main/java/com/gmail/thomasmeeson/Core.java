package com.gmail.thomasmeeson;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Core {

    static IOMethods iom;

    public static void main(String[] args) {


        Account account = new Account("Tom", "Meeson", "Mr", 0);
        Account account1 = new Account("Sam", "Smith", "Sir", 100000);
        Account[] accounts = {account,account1};


        iom.writeOutput(accounts, "output");

//        iom.readInput("input");
    }


//
//    public static void readInput(String fileName, String extension) {
//
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setPrettyPrinting();
//
//        Gson gson = gsonBuilder.create();
//
//        BufferedReader br = null;
//
//        try {
//            br = new BufferedReader(new FileReader(fileName + extension));
//
//
//        } catch (FileNotFoundException e) {
//            System.out.println("File: "+ fileName +" not found");
////            e.printStackTrace();
//
//        }
//
//    }
}
