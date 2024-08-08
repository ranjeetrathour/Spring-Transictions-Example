package com.example.service;

import com.example.dto.DataRecieveAckonwledgement;
import com.example.dto.StudentAndCourseRequest;
import com.example.entity.Course;
import com.example.entity.Student;
import com.example.exception.CouresTypeManditoryException;
import com.example.repository.CourseRepository;
import com.example.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@RequiredArgsConstructor
public class RequestService {

    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public DataRecieveAckonwledgement saveStudentAndCourse(StudentAndCourseRequest studentAndCourseRequest){
        Student student = studentAndCourseRequest.getStudent();
        studentRepository.save(student);
        Course course = studentAndCourseRequest.getCourse();
        if(course.getCourseType()==null){
            throw new CouresTypeManditoryException("course type can't be null");
        }
        courseRepository.save(course);

        return new DataRecieveAckonwledgement("Data saved Success", student.getStudentName(), course.getCourseType());

    }
}
