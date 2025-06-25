package com.dalazu.addprescription.model;

public class MyItem {

    private final String title_text;
    private final String duration_text;
    private final String frequency_text;
    private final String start_date;
    private final String end_date;
    private final String notes_text;


    public String getTitle_text() {
        return title_text;
    }

    public String getDuration_text() {
        return duration_text;
    }

    public String getFrequency_text() {
        return frequency_text;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public String getNotes_text() {
        return notes_text;
    }

    public MyItem(String titleText, String durationText, String frequencyText, String startDate, String endDate, String notesText) {
        title_text = titleText;
        duration_text = durationText;
        frequency_text = frequencyText;
        start_date = startDate;
        end_date = endDate;
        notes_text = notesText;
    }
}
