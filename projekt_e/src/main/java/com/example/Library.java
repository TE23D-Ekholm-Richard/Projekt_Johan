package com.example;
//Detta är föräldrar klassen där barnklassen ärver från
public class Library {
    private int id;
    private String title;
     private boolean isAvailable;

     public Library(int id, String titel, boolean isAvailable){
        this.id=id;
        this.title=titel;
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
         return title;
     }

     public void setTitel(String titel) {
         this.title = titel;
     }

     public boolean isAvailable() {
         return isAvailable;
     }

     public void setAvailable(boolean isAvailable) {
         this.isAvailable = isAvailable;
     }

     
}
