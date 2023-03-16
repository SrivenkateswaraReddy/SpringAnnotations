package com.SpringBootproject.project.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping(value = "/homepage")
public class HomePage {

    private final  static  Logger log = LoggerFactory.getLogger(HomePage.class);


    @GetMapping(value = "/helloWorld")
    public String index() {

        log.warn("from the index page  please see the end point");
        return "helloWorld";
    }


}
