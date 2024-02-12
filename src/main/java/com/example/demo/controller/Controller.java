package com.example.demo.controller;

import com.example.demo.utils.CookieUtils;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
public class Controller {

    private CookieUtils cookieUtils;

    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    public String sayQuote(HttpServletResponse response) {
        cookieUtils.setCookie(response, "__Host-Example", "Hello", "", "/", -1, true);

        return "Your application has been deployed!";
    }

    @Autowired
    public void setCookieUtils(CookieUtils cookieUtils) {
        this.cookieUtils = cookieUtils;
    }
}
