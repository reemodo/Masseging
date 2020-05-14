package com.example.masseging;

import java.util.Date;

public class Rides {
    private int ride_id , driver_id , bus_id , path_id , in_or_out ;
    private Date time_to_start ;
    private String shift ;

    public int getRide_id() {
        return ride_id;
    }

    public void setRide_id(int ride_id) {
        this.ride_id = ride_id;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }

    public int getBus_id() {
        return bus_id;
    }

    public void setBus_id(int bus_id) {
        this.bus_id = bus_id;
    }

    public int getPath_id() {
        return path_id;
    }

    public void setPath_id(int path_id) {
        this.path_id = path_id;
    }

    public int getIn_or_out() {
        return in_or_out;
    }

    public void setIn_or_out(int in_or_out) {
        this.in_or_out = in_or_out;
    }

    public Date getTime_to_start() {
        return time_to_start;
    }

    public void setTime_to_start(Date time_to_start) {
        this.time_to_start = time_to_start;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}