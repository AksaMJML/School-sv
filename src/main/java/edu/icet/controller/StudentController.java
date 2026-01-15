package edu.icet.controller;

import edu.icet.dto.StudentDTO;
import edu.icet.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    StudentService service;

    @PostMapping ("/add")
    public void addStudent(@RequestBody StudentDTO studentDTO){
        service.addStudent(studentDTO);
    }

    @PutMapping("/update")
    public void updateStudent(@RequestBody StudentDTO studentDTO){
        service.updateStudent(studentDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id){
        service.deleteStudent(id);
    }

    @GetMapping("/search-by-id/{id}")
    public StudentDTO searchById(@PathVariable Integer id){
        return service.serachById(id);
    }

    @GetMapping("get-all")
    public List<StudentDTO> getAll(){
        return  service.getAll();
    }
}
