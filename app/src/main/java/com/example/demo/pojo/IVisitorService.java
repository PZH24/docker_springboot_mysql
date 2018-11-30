package com.example.demo.pojo;

import com.example.demo.entity.Visitor;

public interface IVisitorService {
    Visitor findByIp(String ip);
    void saveIp(String ip,int time);
    void saveOrUpdate(String ip,int time);
}
