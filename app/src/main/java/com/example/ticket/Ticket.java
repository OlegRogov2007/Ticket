package com.example.ticket;

import java.io.Serializable;

public class Ticket implements Serializable {

    private String userId,departurePoint,departureTime,arrivalPoint,arrivalTime;

    public Ticket(String userId, String departurePoint, String departureTime, String arrivalPoint, String arrivalTime) {
        this.userId = userId;
        this.departurePoint = departurePoint;
        this.departureTime = departureTime;
        this.arrivalPoint = arrivalPoint;
        this.arrivalTime = arrivalTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public void setArrivalPoint(String arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
