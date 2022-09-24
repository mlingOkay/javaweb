package com.entity;

/**
 * @Author: mlingOkay
 * @CreateTime: 2022-09-21  21:24
 * @Description: TODO
 * @Version: 1.0
 */
public class Product {
    private int pid;
    private String pname;
    private float pprice;
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname=pname;
    }
    public float getPprice() {
        return pprice;
    }
    public void setPprice(float pprice) {
        this.pprice= pprice;
    }
    public Product(int pid,String pname,float pprice) {
        super();
        this.pid=pid;
        this.pname=pname;
        this.pprice=pprice;
    }
    public Product() {
        // TODO Auto-generated constructor stub
    }

}



