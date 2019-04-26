package com.uabc.database.example.examplejpa.model;

import lombok.Data;

@Data
public class LogModel {
    private int id;
    private String date;
    private String details;
    private String username;
    private String url;

    public LogModel() {

    }

    public LogModel(int id, String date, String details, String username, String url) {
        this.id = id;
        this.date = date;
        this.details = details;
        this.username = username;
        this.url = url;
    }
}
