package com.section2.springbootsection2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// @Controller is the annotation, that indicates to spring boot that
// it serves the role of a controller.
// @ResponseBody annotation tells a controller that the object returned
// is automatically serialized into JSON and passed back into the HttpResponse object.
@Controller
@ResponseBody
public class HomeController {

    // All request with path "/" will come here.
    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

}
