package com.example.practice.studentdocumentation.contatactivity_recyclel_view;

import java.util.ArrayList;

public class Contacts {

    private String name;
    private int imagerespource;
    private float prosontage;
    private String DescriptionTravel;
    private boolean online;

    public Contacts(int idImage,String name,String descitpionTravel,float prosontage,boolean online){
        this.name = name;
        this.online = online;
        this.imagerespource = idImage;
       this.prosontage = prosontage;
        this.DescriptionTravel = descitpionTravel;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }



    public float getProsontage() {
        return prosontage;
    }

    public void setProsontage(float prosontage) {
        this.prosontage = prosontage;
    }

    public String getDescriptionTravel() {
        return DescriptionTravel;
    }

    public void setDescriptionTravel(String descriptionTravel) {
        DescriptionTravel = descriptionTravel;
    }

    public int getImagerespource() {
        return imagerespource;
    }

    public void setImagerespource(int imagerespource) {
        this.imagerespource = imagerespource;
    }

//    private static int lastContactId = 0;

//    public static ArrayList<Contacts> createContactsList(int numContacts) {
//        ArrayList<Contacts> contacts = new ArrayList<Contacts>();
//
//        for (int i = 1; i <= numContacts; i++) {
//            contacts.add(new Contacts("Person " + ++lastContactId, i <= numContacts / 2));
//        }
//
//        return contacts;
//    }
}
