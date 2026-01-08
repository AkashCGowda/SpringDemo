package com.example.FirstProject.Controller;

import com.example.FirstProject.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController
{
    //http:localhost:8080/Student
    @GetMapping("/Student")
    public Student  getStudent()
    {
        Student s = new Student(1,"Virat","Kohli");
        return s;
    }
    //http:localhost:8080/Students
    @GetMapping("Students")
    public List<Student> getStudents()
    {
        List<Student> Students = new ArrayList<>();
        Students.add(new Student(2,"AB","Villiers"));
        Students.add(new Student(3,"Mit","Starcy"));
        return Students;
    }


    //Spring BOOT REST API with path Variable
    //{ID}- URI Templete Variable
    //http:localhost:8080/Students/1

    @GetMapping("Students/{ID}")
    public Student StudentPathVariable(@PathVariable("ID") int StudentID)
    {
        return new Student(StudentID,"Virender","Sehwag");
    }

    //For Multiple Path variable
    //http:localhost:8080/Students/5/Jos/Buttler
    @GetMapping("Students/{ID}/{First-name}/{last-name}")
    public Student StudentPathVariable(@PathVariable("ID") int StudentID,
                                       @PathVariable("First-name") String first_name,
                                       @PathVariable("last-name") String last_name)
    {
        return new Student(StudentID,first_name,last_name);
    }


    //Spring BOOT Rest API with Request param
    //http:localhost:8080/Students/query?id=1&firstName=Chris
    @GetMapping("Students/query")
    public Student studentrequestvariable(@RequestParam int id,
                                          @RequestParam String firstName)
    {
        return new Student(id,firstName,"Gayle");
    }
}
