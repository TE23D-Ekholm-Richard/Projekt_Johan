package com.example;

import kong.unirest.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
public class Main {
    public static void main(String[] args) {
        String url_books= "http://10.151.168.5:3120/books";

        HttpResponse<String> response = Unirest.get(url_books).asString();

        String json_data =response.getBody();
        System.out.println("JSON:");
        System.out.println(json_data);

        Gson gson = new Gson();

        ArrayList<Book> books;
        Type typ_beskrivning = new TypeToken<ArrayList<Book>>(){}.getType();

        books = gson.fromJson(json_data, typ_beskrivning);

        System.out.println("böcker:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitel());
        }

        System.out.println("Arralist: "+books);
    }
}