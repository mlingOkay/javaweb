package com.system.pojo;

import java.util.Date;

/**
 * @Author: mlingOkay
 * @CreateTime: 2022-10-06  22:36
 * @Description: TODO
 * @Version: 1.0
 */
public class Employee {
    private int id;
    private String name;
    private String job;
    private double salary;
    private Date date;

    public Employee() {
    }

    public Employee(int id, String name, String job, double salary, Date date) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.date = date;
    }

    public int getId() {
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
