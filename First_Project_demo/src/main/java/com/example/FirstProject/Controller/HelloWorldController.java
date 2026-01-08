package com.example.FirstProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloWorldController {

    //HTTP Get Request
    //http:localhost:8080/hello-world

    @GetMapping("/hello-world")
    public String hello()
    {
        return "HelloWorld !!!";
    }


}
