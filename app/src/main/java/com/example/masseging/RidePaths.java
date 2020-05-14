package com.example.masseging;

import java.util.Date;

public class RidePaths {
    private int Ride_id, Bus_id;
    // private int driver_id , path_id ;
    private String Source, stop1, stop2, stop3, stop4, stop5, stop6, stop7, stop8, stop9, stop10, Destination;
    private String Shift_id;
    private int in_or_out;
    private String Time_to_start;


//    public int getPath_id() {
//        return path_id;
//    }
//
//    public void setPath_id(int path_id) {
//        this.path_id = path_id;
//    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        this.Source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        this.Destination = destination;
    }

    public String getStop1() {
        return stop1;
    }

    public void setStop1(String stop1) {
        this.stop1 = stop1;
    }

    public String getStop2() {
        return stop2;
    }

    public void setStop2(String stop2) {
        this.stop2 = stop2;
    }

    public String getStop3() {
        return stop3;
    }

    public void setStop3(String stop3) {
        this.stop3 = stop3;
    }

    public String getStop4() {
        return stop4;
    }

    public void setStop4(String stop4) {
        this.stop4 = stop4;
    }

    public String getStop5() {
        return stop5;
    }

    public void setStop5(String stop5) {
        this.stop5 = stop5;
    }

    public String getStop6() {
        return stop6;
    }

    public void setStop6(String stop6) {
        this.stop6 = stop6;
    }

    public String getStop7() {
        return stop7;
    }

    public void setStop7(String stop7) {
        this.stop7 = stop7;
    }

    public String getStop8() {
        return stop8;
    }

    public void setStop8(String stop8) {
        this.stop8 = stop8;
    }

    public String getStop9() {
        return stop9;
    }

    public void setStop9(String stop9) {
        this.stop9 = stop9;
    }

    public String getStop10() {
        return stop10;
    }

    public void setStop10(String stop10) {
        this.stop10 = stop10;
    }

    public int getRide_id() {
        return Ride_id;
    }

    public void setRide_id(int ride_id) {
        this.Ride_id = ride_id;
    }

//    public int getDriver_id() {
//        return driver_id;
//    }
//
//    public void setDriver_id(int driver_id) {
//        this.driver_id = driver_id;
//    }

    public int getBus_id() {
        return Bus_id;
    }

    public void setBus_id(int bus_id) {
        this.Bus_id = bus_id;
    }

    public int getIn_or_out() {
        return in_or_out;
    }

    public void setIn_or_out(int in_or_out) {
        this.in_or_out = in_or_out;
    }

    public String getTime_to_start() {
        return Time_to_start;
    }

    public void setTime_to_start(String time_to_start) {
        this.Time_to_start = time_to_start;
    }

    public String getShift_id() {
        return Shift_id;
    }

    public void setShift_id(String shift_id) {
        this.Shift_id = shift_id;
    }

    public RidePaths(int path_id, String source, String destination, String stop1, String stop2, String stop3, String stop4, String stop5, String stop6, String stop7, String stop8, String stop9, String stop10, int ride_id, int driver_id, int bus_id, int in_or_out, String time_to_start, String shift) {
        this.Ride_id = ride_id;
        this.Bus_id = bus_id;
        this.Source = source;
        this.stop1 = stop1;
        this.stop2 = stop2;
        this.stop3 = stop3;
        this.stop4 = stop4;
        this.stop5 = stop5;
        this.stop6 = stop6;
        this.stop7 = stop7;
        this.stop8 = stop8;
        this.stop9 = stop9;
        this.stop10 = stop10;
        this.Destination = destination;
        this.Shift_id = shift;
        this.in_or_out = in_or_out;
        this.Time_to_start = time_to_start;


//        this.driver_id = driver_id;
//        this.path_id = path_id;


    }

    public RidePaths() {
    }
    @Override
    public String toString() {

        String x = " Source : " + Source +
                " \n Destination : " + Destination +
                " \n Shift_id :  " + Shift_id +
                " \n in_or_out : " + in_or_out +
                " \n Time_to_start :" + Time_to_start;
        if (stop1 != null) {
            x = x + " \n Stop at : " + stop1;
        }
        if (stop2 != null) {
            x = x + " \n Stop at : " + stop2;
        }
        if (stop3 != null) {
            x = x + " \n Stop at : " + stop3;
        }
        if (stop4 != null) {
            x = x + " \n Stop at : " + stop4;
        }
        if (stop5 != null) {
            x = x + " \n Stop at : " + stop5;
        }
        if (stop6 != null) {
            x = x + " \n Stop at : " + stop6;
        }
        if (stop7 != null) {
            x = x + " \n Stop at : " + stop7;
        }
        if (stop8 != null) {
            x = x + " \n Stop at : " + stop8;
        }
        if (stop9 != null) {
            x = x + " \n Stop at : " + stop9;
        }
        if (stop10 != null) {
            x = x + " \n Stop at : " + stop10;
        }

        return x;
    }
}
