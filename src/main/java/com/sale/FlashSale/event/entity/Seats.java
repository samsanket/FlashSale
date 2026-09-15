package com.sale.FlashSale.event.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Seats {

    @Id long id;
    long eventId;
    long seatNumber;
    long rowNumber;
    String status;
    long price;


    public Seats(long id, long eventId, long seatNumber, long rowNumber, String status, long price) {
        this.id = id;
        this.eventId = eventId;
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.status = status;
        this.price = price;
    }


    public Seats() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public long getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(long seatNumber) {
        this.seatNumber = seatNumber;
    }

    public long getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(long rowNumber) {
        this.rowNumber = rowNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
