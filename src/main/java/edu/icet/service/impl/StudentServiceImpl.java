package edu.icet.service.impl;

import edu.icet.dto.StudentDTO;
import edu.icet.dto.StudentEntity;
import edu.icet.repositery.StudentRepositery;
import edu.icet.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepositery studentRepositery;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addStudent(StudentDTO studentDTO) {

    }

    @Override
    public void updateStudent(StudentDTO studentDTO) {
        StudentEntity entity = mapper.map(studentDTO, StudentEntity.class);
        studentRepositery.save(entity);
    }

    @Override
    public void deleteStudent(Integer id) {

    }

    @Override
    public StudentDTO serachById(Integer id) {
        return null;
    }

    @Override
    public List<StudentDTO> getAll() {
        return List.of();
    }
}
