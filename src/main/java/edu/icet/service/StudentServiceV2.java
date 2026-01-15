package edu.icet.service;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceV2 implements StudentService{

    public String getVersion(){
        return "V.02.00";
    }

    @Override
    public String getName() {
        return "Shanuka";
    }
}
