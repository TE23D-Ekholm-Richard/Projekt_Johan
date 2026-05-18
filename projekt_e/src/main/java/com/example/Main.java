package com.example;

import kong.unirest.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.util.Scanner;
public class Main {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        

boolean runnning = true;
            while (runnning) {
                   System.out.println("\n===== MENY =====");
            System.out.println("1. Visa böcker");
            System.out.println("2. Skapa bok");
            System.out.println("3. Visa magasin");
            System.out.println("4. Skapa magasin");
            System.out.println("5. Avsluta");
            System.out.print("Välj alternativ: ");
            int val = scan.nextInt();
            

            switch(val){
                case 1:
                    visaBocker();
                    break;

                case 2:
                    skapaBok();
                    break;

                case 3:
                     visaMagasin();
                    break;

                case 4:
                    skapaMagasin();
                    break;
            }
            }


        // Skapa meny för att:
        // - Hämta och visa böcker
        // - Skapa bok (& lägg in i arraylist)
        // - Hämta och visa magasin
        // - Skapa magasin (& lägg in i arraylist)
        // - Avsluta

    }

    // visa bok
  public static void visaBocker(){

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


  public static void skapaBok(){

    System.out.println("Titel: ");
    String titel = scan.nextLine();

    System.out.println("Författare: ");
    String author = scan.nextLine();

    System.out.println("Genre: ");
    String genre = scan.nextLine();

    System.out.println("sidor: ");
    int pages = scan.nextInt();

    scan.nextLine();

    Book nyBook = new Book (0, titel, true , author, genre , pages);

    System.out.println("Bok skapad");
    System.out.println(nyBook);
  }


    
  public static void visaMagasin(){
    
        //magazine här
        String url_magazines = "http://10.151.168.5:3120/magazines";

        HttpResponse<String> responseMag = Unirest.get(url_magazines).asString();

            String json_mag = responseMag.getBody();
        System.out.println("JSON:");
        System.out.println(json_mag);

        Gson gson_1 = new Gson();

        ArrayList<Magazine> magazines;
            Type typ_magazines = new TypeToken<ArrayList<Magazine>>(){}.getType();

        magazines = gson_1.fromJson(json_mag, typ_magazines);

            System.out.println("magazines:");
        for (int i = 0; i < magazines.size(); i++) {
            System.out.println(magazines.get(i).getTitel());
        }

        System.out.println("ArrayList: " + magazines);
  }

  public static void skapaMagasin(){

    System.out.println();

  }
}