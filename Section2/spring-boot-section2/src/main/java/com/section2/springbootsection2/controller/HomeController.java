package com.section2.springbootsection2.controller;

import com.section2.springbootsection2.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

//    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public User getUser(){
        User user = new User();
        user.setId("1");
        user.setName("saivamshi");
        user.setEmailID("saivamshi@gmail.com");
        return user;
    }

    // @PathVariable will change the response based on the path of the URL
    @GetMapping("/{id}/{name}")
    public String pathVariable(@PathVariable("id") String id,
                                @PathVariable("name") String name){
        return id +" "+ name;
    }

    // http://localhost:8081/requestParam?name=Vamshi , hitting this URL would return Vamshi as response in string form
    // http://localhost:8081/requestParam?name=Vamshi&email=sai@gmail.com, hitting this URL would return Vamshi sai@gmail.com as response in string form
    // After specifying required as false, we hit the URL : http://localhost:8081/requestParam?name=Vamshi, now we get the response as Vamshi null.
    @GetMapping("/requestParam")
    public String requestParams(@RequestParam("name") String name,
                                @RequestParam(value = "email",required = false) String emailID){
        return name + " " + emailID;
    }

}
