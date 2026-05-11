package com.example;
//Detta är föräldrar klassen där barnklassen ärver från
public class Library {
    private int id;
    private String titel;
     private boolean isAvailable;

     public Library(int id, String titel, boolean isAvailable){
        this.id=id;
        this.titel=titel;
        this.isAvailable=isAvailable;
     }

     public Library() {
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getTitel() {
         return titel;
     }

     public void setTitel(String titel) {
         this.titel = titel;
     }

     public boolean isAvailable() {
         return isAvailable;
     }

     public void setAvailable(boolean isAvailable) {
         this.isAvailable = isAvailable;
     }

     
}
