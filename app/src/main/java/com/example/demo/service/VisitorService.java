package com.example.demo.service;

import com.example.demo.dao.IVisitorDao;
import com.example.demo.entity.Visitor;
import com.example.demo.pojo.IVisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitorService implements IVisitorService {
    @Autowired
    private IVisitorDao visitorDao;
    @Override
    public Visitor findByIp(String ip) {
        return  visitorDao.findByIp(ip);
    }

    @Override
    public void saveIp(String ip, int time) {
       Visitor visitor = new Visitor();
        visitor.setIp(ip);
        visitor.setTimes(time);
        visitorDao.save(visitor);
    }

    @Override
    public void saveOrUpdate(String ip, int time) {
        Visitor visitor =  visitorDao.findByIp(ip);
        if(visitor!=null){
            visitorDao.delete(visitor);
        }
        saveIp(ip,time);
    }
}
