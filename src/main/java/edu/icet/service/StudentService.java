package edu.icet.service;

import java.util.List;

public interface StudentService {

    void addStudent(StudentDTO studentDTO);
    void updateStudent(StudentDTO studentDTO);
    void deleteStudent(Integer id);
    List<StudentDTO> serachById(Integer id);
    List<StudentDTO> getAll();
}
