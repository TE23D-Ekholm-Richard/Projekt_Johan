package com.example;

public class Magazine extends Library {
    private int issueNumber;
    private String category;
    private int publishyear;

    public Magazine(){

    }

    public Magazine(int id, String titel, boolean isAvailable, int issueNumber, String category, int publishyear){
        super(id,titel,isAvailable);
        this.issueNumber=issueNumber;
        this.category=category;
        this.publishyear=publishyear;

    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPublishyear() {
        return publishyear;
    }

    public void setPublishyear(int publishyear) {
        this.publishyear = publishyear;
    }
    
}
