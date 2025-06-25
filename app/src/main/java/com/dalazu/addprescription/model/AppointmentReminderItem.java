package com.dalazu.addprescription.model;

public class AppointmentReminderItem {
    String name, date, time, serialNumber, visit, number, chamber;

    public AppointmentReminderItem(String name, String date, String time, String serialNumber, String visit, String number, String chamber) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.serialNumber = serialNumber;
        this.visit = visit;
        this.number = number;
        this.chamber = chamber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getVisit() {
        return visit;
    }

    public void setVisit(String visit) {
        this.visit = visit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getChamber() {
        return chamber;
    }

    public void setChamber(String chamber) {
        this.chamber = chamber;
    }
}
