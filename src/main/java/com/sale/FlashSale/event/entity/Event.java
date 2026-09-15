package com.sale.FlashSale.event.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Event {

    @Id long id;
    String name;
    String venue;
    LocalDateTime eventDate;
    String status;

    public Event(long id, String name, String venue, LocalDateTime eventDate, String status) {
        this.id = id;
        this.name = name;
        this.venue = venue;
        this.eventDate = eventDate;
        this.status = status;
    }

    public Event() {
    }


    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
