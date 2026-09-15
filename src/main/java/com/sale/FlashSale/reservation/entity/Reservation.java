package com.sale.FlashSale.reservation.entity;

import com.sale.FlashSale.constatnts.RESERVATIONStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Reservation {
    @Id
    long id;

    long userId;

    long eventId;

    long seatId;

    RESERVATIONStatus status;

    LocalDateTime createdAt;

    LocalDateTime ExpireAt;

    public Reservation(long id, long userId, long eventId, long seatId, RESERVATIONStatus status, LocalDateTime createdAt, LocalDateTime expireAt) {
        this.id = id;
        this.userId = userId;
        this.eventId = eventId;
        this.seatId = seatId;
        this.status = status;
        this.createdAt = createdAt;
        ExpireAt = expireAt;
    }

    public Reservation() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public long getSeatId() {
        return seatId;
    }

    public void setSeatId(long seatId) {
        this.seatId = seatId;
    }

    public RESERVATIONStatus getStatus() {
        return status;
    }

    public void setStatus(RESERVATIONStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getExpireAt() {
        return ExpireAt;
    }

    public void setExpireAt(LocalDateTime expireAt) {
        ExpireAt = expireAt;
    }
}
