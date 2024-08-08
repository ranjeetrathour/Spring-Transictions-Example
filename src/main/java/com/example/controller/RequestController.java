package com.example.controller;

import com.example.dto.DataRecieveAckonwledgement;
import com.example.dto.StudentAndCourseRequest;
import com.example.service.RequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transictions")
//@RequiredArgsConstructor
public class RequestController {

    @Autowired
    private RequestService requestService;

    @PostMapping("/save")
    public DataRecieveAckonwledgement saveStudentAndCourse(@RequestBody StudentAndCourseRequest studentAndCourseRequest){
        return requestService.saveStudentAndCourse(studentAndCourseRequest);
    }
}
