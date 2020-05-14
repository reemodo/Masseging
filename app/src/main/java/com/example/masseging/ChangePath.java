package com.example.masseging;

import java.sql.Time;
import java.util.Date;

public class ChangePath {
    private  int student_id , ride_id ;
    private Date date ;
    private Date time;
    private String description , new_location ;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getRide_id() {
        return ride_id;
    }

    public void setRide_id(int ride_id) {
        this.ride_id = ride_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNew_location() {
        return new_location;
    }

    public void setNew_location(String new_location) {
        this.new_location = new_location;
    }
}
