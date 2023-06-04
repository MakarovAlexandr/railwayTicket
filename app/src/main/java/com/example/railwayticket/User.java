package com.example.railwayticket;

import java.io.Serializable;

public class User implements Serializable {

    // поля сущности
    private String name;
    private String startPlace;
    private String startTime;
    private String endPlace;

    // необходимый конструктор
    public User(String name, String startPlace, String startTime, String endPlace) {
        this.name = name;
        this.startPlace = startPlace;
        this.startTime = startTime;
        this.endPlace = endPlace;
    }

    // геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartTime(String startTime) { this.startTime = startTime; }

    public String getStartTime() { return  startTime; }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace;
    }
}
