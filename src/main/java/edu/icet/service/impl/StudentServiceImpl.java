package edu.icet.service.impl;

import edu.icet.dto.StudentDTO;
import edu.icet.entity.StudentEntity;
import edu.icet.repositery.StudentRepositery;
import edu.icet.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepositery studentRepositery;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addStudent(StudentDTO studentDTO) {
        StudentEntity entity = mapper.map(studentDTO, StudentEntity.class);
        studentRepositery.save(entity);
    }

    @Override
    public void updateStudent(StudentDTO studentDTO) {
        StudentEntity entity = mapper.map(studentDTO, StudentEntity.class);
        studentRepositery.save(entity);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepositery.deleteById(id);
    }

    @Override
    public StudentDTO serachById(Integer id) {
        StudentEntity studentEntity = studentRepositery.findById(id).get();
        StudentDTO studentDTO = mapper.map(studentEntity, StudentDTO.class);
        return studentDTO;
    }

    @Override
    public List<StudentDTO> getAll() {
        List<StudentEntity> studentEntities = studentRepositery.findAll();
        ArrayList<StudentDTO> studentDtoArrayList = new ArrayList<>();
        studentEntities.forEach(studentEntity -> {
            StudentDTO studentDTO = mapper.map(studentEntity, StudentDTO.class);
            studentDtoArrayList.add(studentDTO);
        });

        return studentDtoArrayList;
    }
}
