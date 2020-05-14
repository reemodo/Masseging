package com.example.masseging;

import java.util.Date;

// hello

public class Students {
    private int Student_id , School_id ;
    private String Student_name;
    private int Parent_id, City_id, Neigborhood_id;
    private String address ;
    private double Longitude, Latitude;
    private Date DOB;
    private int Class_id, Section_id, HTS_ride_id, STH_ride_id;

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        this.Student_id = student_id;
    }

    public int getParent_id() {
        return Parent_id;
    }

    public void setParent_id(int parent_id) {
        this.Parent_id = parent_id;
    }

    public int getCity_id() {
        return City_id;
    }

    public void setCity_id(int city_id) {
        this.City_id = city_id;
    }

    public int getNeigborhood_id() {
        return Neigborhood_id;
    }

    public void setNeigborhood_id(int neigborhood_id) {
        this.Neigborhood_id = neigborhood_id;
    }

    public int getSchool_id() {
        return School_id;
    }

    public void setSchool_id(int school_id) {
        this.School_id = school_id;
    }

    public int getClass_id() {
        return Class_id;
    }

    public void setClass_id(int class_id) {
        this.Class_id = class_id;
    }

    public int getSection_id() {
        return Section_id;
    }

    public void setSection_id(int section_id) {
        this.Section_id = section_id;
    }

    public int getHTS_ride_id() {
        return HTS_ride_id;
    }

    public void setHTS_ride_id(int HTS_ride_id) {
        this.HTS_ride_id = HTS_ride_id;
    }

    public int getSTH_ride_id() {
        return STH_ride_id;
    }

    public void setSTH_ride_id(int STH_ride_id) {
        this.STH_ride_id = STH_ride_id;
    }

    public String getStudent_name() {
        return Student_name;
    }

    public void setStudent_name(String student_name) {
        this.Student_name = student_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        this.Longitude = longitude;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        this.Latitude = latitude;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return
                "- Student_name='" + Student_name + '\n' +
                        "- address='" + address + '\n' +
                        "- Class_id=" + Class_id +
                        "- Section_id=" + Section_id ;
    }
}
