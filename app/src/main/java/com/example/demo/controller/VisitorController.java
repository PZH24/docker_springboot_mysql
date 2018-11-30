package com.example.demo.controller;

import com.example.demo.entity.Visitor;
import com.example.demo.pojo.IVisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
@RestController
public class VisitorController {
    @Autowired
    private IVisitorService visitorService;
    @RequestMapping("/visitor")
    public String index(HttpServletRequest request) {
        String ip=request.getRemoteAddr();
        Visitor visitor=visitorService.findByIp(ip);
        int times = 1;
        if(visitor!=null){
            times= visitor.getTimes()+1;
        }
        visitorService.saveOrUpdate(ip,times);
        return "I have been seen ip "+visitor.getIp()+" "+times+" times.";
    }
}
