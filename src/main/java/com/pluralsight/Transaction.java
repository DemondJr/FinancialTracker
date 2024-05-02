package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Transaction {
    private LocalDate date;
    private LocalTime time;
    private String type;
    private String vendor;
    private double price;

    public Transaction(LocalDate date, LocalTime time, String type, String vendor, double price) {
        this.date = date;
        this.time = time;
        this.type = type;
        this.vendor = vendor;
        this.price = price;



    }
    public Transaction(LocalDateTime dateTime, String type, String vendor, double price) {
        this.date = dateTime.toLocalDate();
        this.time = dateTime.toLocalTime();
        this.type = type;
        this.vendor = vendor;
        this.price = 0.0;



    }
    public Transaction(LocalDate date,LocalTime time, String type, String vendor) {
        this.date = date;
        this.time = time;
        this.type = type;
        this.vendor = vendor;
        this.price = 0.0;



    }


    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getType() {
        return type;
    }

    public String getVendor() {
        return vendor;
    }

    public double getPrice() {
        return price;
    }
}


