package com.example.masseging;
import java.util.Date;
public class DailyShift {
    private int student_id , ride_id , city_id  , neighborhood_id, in_or_out , decline;
    private Date date;
    private  String decline_description;

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

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getNeighborhood_id() {
        return neighborhood_id;
    }

    public void setNeighborhood_id(int neighborhood_id) {
        this.neighborhood_id = neighborhood_id;
    }

    public int getIn_or_out() {
        return in_or_out;
    }

    public void setIn_or_out(int in_or_out) {
        this.in_or_out = in_or_out;
    }

    public int getDecline() {
        return decline;
    }

    public void setDecline(int decline) {
        this.decline = decline;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDecline_description() {
        return decline_description;
    }

    public void setDecline_description(String decline_description) {
        this.decline_description = decline_description;
    }
}