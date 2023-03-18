package com.driver.model;

import javax.persistence.*;

@Entity
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int kmPerHour;
    private boolean available;
    @OneToOne
    @JoinColumn
    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Cab(int id, int kmPerHour, boolean available, Driver driver) {
        this.id = id;
        this.kmPerHour = kmPerHour;
        this.available = available;
        this.driver = driver;
    }

    public Cab() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKmPerHour() {
        return kmPerHour;
    }

    public void setKmPerHour(int kmPerHour) {
        this.kmPerHour = kmPerHour;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}