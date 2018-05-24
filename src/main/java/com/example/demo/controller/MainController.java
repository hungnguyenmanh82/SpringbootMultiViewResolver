package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class MainController {
 
    @RequestMapping(value = { "/testJsp" }, method = RequestMethod.GET)
    public String testJspView() {
 
        return "testJsp"; //  webapp/WEB-INF/jsp/testJsp.jsp
    }
 
    @RequestMapping(value = { "/testThymeleaf" }, method = RequestMethod.GET)
    public String testThymeleafView() {
 
        return "th_page1"; //resources/templates/th_page1.html  
    }
     
    @RequestMapping(value = { "/testFreeMarker" }, method = RequestMethod.GET)
    public String testFreeMarkerView() {
 
        return "testFreeMarker"; //resources/templates/freeMarker/testFreeMarker.ftl
    }
     
}