package edu.icet.controller;

import edu.icet.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/get-name")
    public String getName(){
        return new StudentService().getName();
    }
}
