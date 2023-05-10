package com.section2.springbootsection2.controller;

import com.section2.springbootsection2.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @Controller is the annotation, that indicates to spring boot that
// it serves the role of a controller.
// @ResponseBody annotation tells a controller that the object returned
// is automatically serialized into JSON and passed back into the HttpResponse object.
//@Controller
//@ResponseBody
// Using @RestController instead of both @Controller and @ResponseBody
// The @RestController will have the above 2 annotations defined.
@RestController
public class HomeController {

    // All request with path "/" will come here.
    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

    @RequestMapping("/user")
    public User getUser(){
        User user = new User();
        user.setId("1");
        user.setName("saivamshi");
        user.setEmailID("saivamshi@gmail.com");
        return user;
    }

}
