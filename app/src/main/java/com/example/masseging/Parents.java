package com.example.masseging;

public class Parents {
    private int Parent_id ;
    private String Father_name  , Mother_Name ;
    private String Mother_phone , Father_phone;
    private int Neigborhood_id, City_id;
    private String address ;
    private double Longitude , Latitude ;
    private String ID_number ;

    public int getParent_id() {
        return Parent_id;
    }

    public void setParent_id(int parent_id) {
        this.Parent_id = parent_id;
    }

    public int getNeigborhood_id() {
        return Neigborhood_id;
    }

    public void setNeigborhood_id(int neigborhood_id) {
        this.Neigborhood_id = neigborhood_id;
    }

    public int getCity_id() {
        return City_id;
    }

    public void setCity_id(int city_id) {
        this.City_id = city_id;
    }

    public String getFather_name() {
        return Father_name;
    }

    public void setFather_name(String Father_name) {
        this.Father_name = Father_name;
    }

    public String getMother_name() {
        return Mother_Name;
    }

    public void setMother_name(String Mother_Name) {
        this.Mother_Name = Mother_Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String getId_num() {
        return ID_number;
    }

    public void setId_num(String ID_number) {
        this.ID_number = ID_number;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double Longitude) {
        this.Longitude = Longitude;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double Latitude) {
        this.Latitude = Latitude;
    }

    public String getFather_phone() {
        return Father_phone;
    }

    public void setFather_phone(String father_phone) {
        Father_phone = father_phone;
    }

    public String getMother_phone() {
        return Mother_phone;
    }

    public void setMother_phone(String mother_phone) {
        Mother_phone = mother_phone;
    }
}


