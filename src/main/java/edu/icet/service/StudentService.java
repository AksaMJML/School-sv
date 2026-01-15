package edu.icet.service;

import edu.icet.dto.StudentDTO;

import java.util.List;

public interface StudentService {

    void addStudent(StudentDTO studentDTO);
    void updateStudent(StudentDTO studentDTO);
    void deleteStudent(Integer id);
    StudentDTO serachById(Integer id);
    List<StudentDTO> getAll();
}
