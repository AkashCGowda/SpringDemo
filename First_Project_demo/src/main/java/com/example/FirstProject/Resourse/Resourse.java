package com.example.FirstProject.Resourse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class Resourse
{
    //http:localhost:8080/yo
    @GetMapping("/yo")
 public String yo()
 {
     return "Whats up";
 }
}
