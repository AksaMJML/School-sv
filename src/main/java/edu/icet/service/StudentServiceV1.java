package edu.icet.service;

import org.springframework.stereotype.Service;


public class StudentServiceV1 implements StudentService{

    public String getName(){
        return "Aksa";
    }

    public String getVersion(){
        return "V.01.0";
    }
}
