package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserHtml5Controller {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    @RequestMapping("/editUser")
    public String editUser() {
        return "editUser";
    }
    @RequestMapping("/AllUserLst")
    public String AllUserLst() {
        return "AllUserLst";
    }
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    @RequestMapping("/registered")
    public String registered() {
        return "registered";
    }
    @RequestMapping("/chatRoom")
    public String chatRoom(){
        return "chatRoom";
    }
}
