package com.dalazu.addprescription.model;

public class WaterReminderItems {
    public WaterReminderItems(String nextReminder, String date) {
        this.nextReminder = nextReminder;
        this.date = date;
    }

    private final String nextReminder;
    private final String date;

    public String getNextReminder() {
        return nextReminder;
    }

    public String getDate() {
        return date;
    }
}
