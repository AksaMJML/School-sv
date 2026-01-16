package edu.icet.repositery;

import edu.icet.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositery extends JpaRepository<StudentEntity, Integer> {

}
