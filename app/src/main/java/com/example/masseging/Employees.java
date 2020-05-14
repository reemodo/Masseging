package com.example.masseging;

public class Employees {

    private int Employee_id;
    private String Employee_name;
    private int School_id;
    private String Phone_Num;
    private int Job_id;

    public int getEmployee_id() {
        return Employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.Employee_id = employee_id;
    }

    public int getSchool_id() {
        return School_id;
    }

    public void setSchool_id(int school_id) {
        this.School_id = school_id;
    }

    public int getJob_id() {
        return Job_id;
    }

    public void setJob_id(int job_id) {
        this.Job_id = job_id;
    }

    public String getPhone_Num() {
        return Phone_Num;
    }

    public void setPhone_Num(String phone_Num) {
        this.Phone_Num = phone_Num;
    }

    public String getEmployee_name() {
        return Employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.Employee_name = employee_name;
    }
}
