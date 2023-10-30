package org.lessons.java;

import java.time.LocalDate;


public class Event {
    //ATTRIBUTI
    private String title;
    private LocalDate date;
    private int totalPlaces;
    private int reservedPlaces = 0;


    //COSTRUTTORI
    public Event(String title, LocalDate date, int totalPlaces) throws IllegalArgumentException {

        if (totalPlaces <= 0){
            throw new IllegalArgumentException("Non puoi immettere numeri negativi");
        }
        if (date.isBefore(dateNow())){
            throw new IllegalArgumentException("La data non è valida");
        }
        this.title = title;
        this.date = date;
        this.totalPlaces = totalPlaces;
    }

    //METODI

    //GETTER
    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getTotalPlaces() {
        return totalPlaces;
    }

    public int getReservedPlaces() {
        return reservedPlaces;
    }

    public LocalDate dateNow(){
        LocalDate today = LocalDate.now();
        return today;
    }

    //SETTER
    public void setTitle(String title) {
        this.title = title;
    }

    public void reservePlaces(int reservedPlaces) {
        this.reservedPlaces += reservedPlaces;
    }

    public void cancelPlaces(int reservedPlaces) {
        this.reservedPlaces -= reservedPlaces;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
