package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = Visitor.TableName)
public class Visitor {
    public static final String TableName = "Visitor";

    private String ip;
    private int times;
    private Long rid;
    @Id
    @GeneratedValue
    public Long getRid() {
        return rid;
    }
    public void setRid(Long rid) {
       this.rid =rid;
    }
    @Column(name="IP", length=200)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    @Column(name="TIMES", length=50)
    public int getTimes() {
        return times;
    }

    public void setTimes(int time) {
        this.times = time;
    }
}
